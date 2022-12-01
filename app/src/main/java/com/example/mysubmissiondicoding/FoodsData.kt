package com.example.mysubmissiondicoding

object FoodsData {
    private val foodNames = arrayOf("Rendang",
        "Sate",
        "Nasi Goreng",
        "Bakso",
        "Soto",
        "Rawon",
        "Gado-Gado",
        "Nasi Padang",
        "Sambal",
        "Pempek")

    private val foodDetails = arrayOf("Siapa yang tidak tahu makanan khas dari Sumatera Barat yang satu ini. Irisan daging sapi yang dimasak dengan rempah khas padang yang gurih.\n" +
            "\n" +
            "Ada dua proses pemasakan daging sapi yang kaya akan rempah ini. Untuk memasang rendang, dibutuhkan waktu minimal 4 jam untuk menjadikan daging rendang berwarna hitam pekat dan bumbu mengering seperti dedak.",
    "Sate juga salah satu makanan yang mudah untuk dijumpai di Indonesia. Sate adalah kuliner khas Indonesia yang menggunakan daging ayam, sapi, kambing, kelinci, ataupun kerbau sebagai bahan bakunya.\n" +
            "\n" +
            "Daging tersebut dipotong, direndam dengan bumbu marinasi lalu dibakar hingga matang. Setelah itu sate disajikan dengan beragam saus, mulai dari saus kacang ataupun saus kecap.",
    "Ada yang belum pernah menyantap nasi goreng? Pastinya hampir seluruh orang tau kuliner yang satu ini. Selain lezat, nasi goreng adalah kuliner yang mudah untuk dimasak.\n" +
            "\n" +
            "Nasi goreng sendiri banyak versinya, ada nasi goreng kampung, nasi goreng ijo, nasi goreng jawa, nasi goreng teri, nasi goreng seafood, nasi goreng, nasi goreng sunda, nasi goreng mawut, dll.",
    "Bakso merupakan olahan dari daging sapi yang dihaluskan, dicampur dengan bumbu halus, tepung terigu, dan penyedap rasa. Adonan tersebut dibentuk bola lalu direbus hingga matang.\n" +
            "\n" +
            "Bakso disajikan bersama kuah kaldu sapi beserta pelengkap berupa mie kuning, bihun, tahu bakso, dan rajangan daun seledri.",
    "Soto, Coto, Sauto, Tauto adalah makanan khas Indonesia sejenis sup dengan kuah rebusan ayam atau sapi. Soto biasanya memakai dua jenis daging, yakni daging ayam dan dan daging sapi.\n" +
            "\n" +
            "Soto ayam memiliki kuah berwarna kekuningan dengan rasa gurih dan harum. Warna kuning dikarenakan dari kunyit, bawang merah, bawang putih sebagai bumbu dasarnya. Sedangkan soto daging biasa berwarna bening atau berkuah santan.",
    "Rawon adalah makan khas dari Kota Surabaya yang mirip dengan sup daging namun memiliki kuah hitam pekat. Meskipun kuahnya tidak seperti sup pada umumnya, rawon memiliki cita rasa yang khas dan selalu dirindukan oleh penikmat masakan Jawa timuran.\n" +
            "\n" +
            "Warna hitam pada rawon disebabkan oleh pemakaian kluwek pada kuahnya. Buah kluwek adalah buah berwarna hitam yang memberikan warna serta citarasa yang unik pada masakan.\n" +
            "\n",
    "Gado-gado adalah makanan khas dari Jakarta yang menyehatkan karena terdiri dari rebusan sayuran seperti kangkung, wortel, labu siam, selada, timun dan irisan tempe yang disiram dengan saus kacang yang gurih.\n" +
            "\n" +
            "Di Jawa Barat Gado-gado disebut dengan Lotek. Serupa bentuknya namun tak sama citarasanya. Lotek memakai bumbu kacang, bawang putih, kencur, dan asam jawa sehingga memiliki bau yang lebih kuat dan lebih manis dibandingkan Gado-gado.",
    "Nasi Padang sebenarnya adalah nasi putih yang disajikan bersama aneka jenis lauk khas Padang seperti rendang, gulai ikan, ayam bakar, ayam pop, telor dadar, kering tempe, daging cincang, daun singkong rebus dan sambal ijo.\n" +
            "\n" +
            "Yang menarik dalam menyantap nasi padang di restoran adalah cara penyajian. Kalian bisa menyantap dengan cara semua menu dihidangkan di meja, sehingga kalian tinggal memilih makanan yang akan disantap. Cara kedua adalah dengan memesan langsung 1 porsi nasi padang tanpa harus meminta untuk dihidangkan di meja.",
    "Sambal adalah menu wajib orang Indonesia dalam menyantap kuliner apapun. Tak lengkap rasanya jika makan tanpa sambal, apalagi jika sambalnya dibuat langsung bukan sambal kemasan.\n" +
            "\n" +
            "Sambal adalah pelengkap nasi yang berbahan dasar cabai merah/hijau, cabai rawit, bawang merah, bawang putih, garam, dan gula yang diulek hingga setengah halus. Sambal memiliki citarasa pedas menyegarkan. Terdapat banyak sekali varian sambal di Indonesia yakni, sambal tomat, sambal bajak, sambal korek, sambal matah, sambal ijo, sambal terasi, sambal teri, sambal pete, sambal mangga, dll.",
    "Pempek merupakan kuliner khas Sumatra yang terbuat dari ikan tenggiri, toman, atau gabus yang dihaluskan, dicampur bersama tepung sagu dan bumbu halus. Pempek diuleni hingga kalis lalu direbus dalam air mendidih. setelah itu pempek digoreng dan disantap bersama kuah cuko. Kuah cuko adalah kuah yang terbuat dari rebusan gula merah dan cuka.\n" +
            "\n" +
            "Pempek memiliki berbagai jenis yakni kapal selam (pempek yang diisi dengan telur), lenjer (pempek berbentuk panjang), ada’an (pempek berbentuk bulat), pempek telur, pempek kulit ikan da pempek keriting.")

    private val foodsImages = intArrayOf(R.drawable.rendang,
        R.drawable.sate,
        R.drawable.nasi_goreng,
        R.drawable.bakso,
        R.drawable.soto,
        R.drawable.rawon,
        R.drawable.gado_gado,
        R.drawable.nasi_padang,
        R.drawable.sambal,
        R.drawable.pempek)

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodsImages[position]
                list.add(food)
            }
            return list
        }
}