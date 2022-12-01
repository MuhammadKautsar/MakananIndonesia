package com.example.mysubmissiondicoding

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(val listFood: ArrayList<Food>, val context: Context) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bindItem(listFood[position])
        holder.itemView.setOnClickListener {
            val getData = listFood.get(position)
            val DetailName: String = getData.name
            val DetailDesc: String = getData.detail
            val DetailPhoto: Int = getData.photo

            val moveToDetail = Intent(context, DetailActivity::class.java)
            moveToDetail.putExtra("mName", DetailName)
            moveToDetail.putExtra("mDetail", DetailDesc)
            moveToDetail.putExtra("mPhoto", DetailPhoto)
            context.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(food: Food) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
            tvName.text = food.name
            tvDetail.text = food.detail
            imgPhoto.setImageResource(food.photo)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}