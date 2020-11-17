/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan60.akatsuki;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("KARAKTER-KARAKTER NARUTO AKATSUKI");
        System.out.println();
        
        //Pain Tendo
        PainTendo pt = new PainTendo("Pain Tendo", "Amegakure", "Pemimpin", "Rei (nol)", "Jempol kanan");
        pt.setTujuan("Penguasaan dunia dengan kekuatan mutlak dan mendirikan desa mereka sendiri yang\n" +
                        "\t\t\t    mampu menerima tugas apapun, termasuk pembunuhan, penyerangan, penculikan\n" +
                        "\t\t\t    perang, dan tugas kotor lainnya.");
        pt.setPengendali("Uzumaki Nagato");
        pt.tampilAtributSuper();
        pt.tampilCiriKhas("- Memiliki besi hitam berupa tindikan di hampir seluruh tubuh\n" +
                            "\t\t  - Rambut Jingga");
        pt.tampilKekuatan("Menduplikasikan kekuatannya dengan menggunakan tubuh mayat manusia");
        System.out.println("Tujuan mendirikan Akatsuki: " + pt.getTujuan());
        System.out.println("Dikendalikan oleh : " + pt.getPengendali());
        pt.tampilDeskripsi("Kemampuan Pain seimbang dengan jumlah chakra yang diberikan kepada masing-masing\n" +
                            "\t\t  hasil duplikasi ini. Ketika tiba saatnya berkumpul, Pain dapat memanggil\n" +
                            "\t\t  Pain lainnya bahkan dari tempat yang jauh dengan menggunakan Kuchiyose\n" +
                            "\t\t  no Jutsu.");
        System.out.println();
        
        //Obito Uchiha
        ObitoUchiha ou = new ObitoUchiha("Obito Uchiha", "Konoha Gakure", "Pemimpin", "Gyokunyo (Virgo)","Jempol kiri");
        ou.setNamaPanggilan("Tobi");
        ou.setElemen("Api");
        ou.setKarakter("Aneh, ceroboh, dan dipandang sebagai anggota terlemah.");
        ou.setTujuan("Mampu melemparkan Tsukuyomi tak terbatas dan menjebak seluruh dunia di bawah genjutsu dan\n" +
                        "\t\t\t     memberikan dia kekuatan untuk menciptakan dunia yang ia inginkan.");
        ou.tampilAtributSuper();
        System.out.println("Nama panggilan\t: " + ou.getNamaPanggilan());
        ou.tampilCiriKhas("Topeng jingga satu lubang mata dengan pola pusaran yang terpusat pada mata kanan.");
        ou.tampilKekuatan("Memiliki Sharingan yang dapat membuat tubuhnya tembus dari serangan.");
        System.out.println("Elemen\t\t: " + ou.getElemen());
        System.out.println("Karakter\t: " + ou.getKarakter());
        System.out.println("Tujuan mendirikan Akatsuki : " + ou.getTujuan());
        ou.tampilDeskripsi("Dia hanya pura-pura dengan tidak menampilkan kekuatan dan identitasnya. Tobi sebenarnya\n" +
                            "\t\t  bukanlah Madara Uchiha seperti yang disebut-sebut, dia adalah Obito Uchiha, salah\n" +
                            "\t\t  satu teman masa kecilnya Kakashi Hatake. Obito juga memerikan sebelah matanya pada\n" +
                            "\t\t  Kakashi Hatake dalam wujud mata Sharingan.");
        System.out.println();
        
        //Deidara
        Deidara d = new Deidara("Deidara", "Iwa Gakure", "Anggota", "Seiryu (Naga Biru)", "Telunjuk kanan");
        d.setElemen("Tanah");
        d.setKarakter("Paling cerewet");
        d.tampilAtributSuper();
        d.tampilCiriKhas("Berambut pirang dan dikuncir");
        d.tampilKekuatan("Membuat bom tanah liat dengan cara mengunyahkan tanah liat pada telapak tangannya yang\n" +
                            "\t\t  memiliki mulut.");
        System.out.println("Elemen\t\t: " + d.getElemen());
        System.out.println("Karakter\t: " + d.getKarakter());
        d.tampilDeskripsi("Deidara adalah seorang ninja pelarian. Deidara mengatakan jika setiap bom yang dibuatnya\n" +
                            "\t\t  merupakan suatu hasil karya seni.");
        System.out.println();
        
        
        //Kisame Hoshigake
        KisameHoshigaki kh = new KisameHoshigaki("Kisame Hoshigake", "Kiri Gakure", "Anggota", "Nanju (Bintang selatan)", "Jari manis kiri");
        kh.setElemen("Air");
        kh.setKarakter("Meskipun penampilannya ganas, tetapi dia berbicara dengan tenang dan sopan");
        kh.tampilAtributSuper();
        kh.tampilCiriKhas("Menyerupai ikan hiu, lengkap dengan kulit berwarna biru pucat dengan mata yang kecil, serta\n" +
                            "\t\t  memiliki struktur muka yang menyerupai insang dan gigi berbentuk segitiga tajam.");
        kh.tampilKekuatan("Pedang samehada, cakra yang melimpah dan jurus-jurus elemen air.");
        System.out.println("Elemen\t\t: " + kh.getElemen());
        System.out.println("Karakter\t: " + kh.getKarakter());
        kh.tampilDeskripsi("Dia adalah salah satu dari 7 pengguna pedang kiri gakure, Kisame juga dijuluki sebagai bijuu\n" +
                            "\t\t  tanpa ekor karna dia memiliki cakra yang sangat banyak seperti para bijuu, dia pengguna\n" +
                            "\t\t  pedang Samehadaku yang dapat menyerap cakra lawan.");
        System.out.println();
        
        //Kakuzu
        Kakuzu k = new Kakuzu("Kakuzu", "Taki Gakure", "Anggota", "Hokuto (Bintang Utara)", "Jari tengah kiri");
        k.setElemen("Angin, api, tanah, air, dan petir");
        k.setKarakter("Rajin mengumpulkan uang, individu rakus, dan mengutamakan seberapa berharganya suatu benda.");
        k.tampilAtributSuper();
        k.tampilCiriKhas("Menggunakan penutup wajah");
        k.tampilKekuatan("Dapat memperpanjang hidupnya dengan cara mengambil jantung manusia, dapat memiliki lima jantung\n" +
                            "\t\t  manusia secara bersamaan, dapat menggunakan seluruh lima elemen chakra, tubuh terdiri dari\n" +
                            "\t\t  jaring-jaring untuk menyerang dan memanipulasi tubuh yang lain.");
        System.out.println("Elemen\t\t: " + k.getElemen());
        System.out.println("Karakter\t: " + k.getKarakter());
        k.tampilDeskripsi("Setiap elemen yang dimilikinya memiliki satu jantung, makanya jantungnya ada 5 buah.");
        System.out.println();
        
        //Konan
        Konan ko = new Konan("Konan", "Ame Gakure", "Anggota", "Byakko (Harimau Putih)", "Jari tengah, tangan kanan");
        ko.tampilAtributSuper();
        ko.tampilCiriKhas("Memiliki aksesoris seperti bunga di kepalanya");
        ko.tampilKekuatan("Jurus origami yaitu kertas lipat, dia juga dapat membuat tubuhnya menjadi lembaran-lembaran kertas.\n" +
                            "\t\t  Namun ninjutsu itu tidak berhasil jika tubuh Konan dibasahi dengan zat cair.");
        ko.tampilDeskripsi("Satu-satunya anggota perempuan. Dia adalah mantan murid Jiraiya Sannin.");
        System.out.println();
        
        //Hidan
        Hidan h = new Hidan("Hidan", "Yu Gakure", "Anggota", "Santai (Tiga Tingkatan)", "Telunjuk kiri");
        h.setKarakter("Sangat agamis, tetapi suka berbicara kotor");
        h.setKepercayaan("Menyembah Dewa Jashin (percaya apapun yang tidak menghasilkan perusakan dianggap sebagai dosa.");
        h.tampilAtributSuper();
        System.out.println("Kepercayaan\t: " + h.getKepercayaan());
        System.out.println("Karakter\t: " + h.getKarakter());
        h.tampilCiriKhas("Membawa sabit besar bermata tiga dan memiliki rambut cepak putih.");
        h.tampilKekuatan("Bisa melukai lawannya dengan cara melukai dirinya sendiri setelah meminum darah lawannya.");
        h.tampilDeskripsi("Dia selalu melakukan ritual keagamaannya setelah bertarung.");
        System.out.println();
        
        //Zetsu
        Zetsu z = new Zetsu("Zetsu", "Kusa Gakure", "Anggota", "Genbu (Kura-kura)", "Kelingking kanan");
        z.tampilAtributSuper();
        z.tampilCiriKhas("Kepalanya diselubungi oleh semacam tudung seperti tanaman Venus penangkap lalat yang besar, yang\n" +
                            "\t\t  juga membungkus tubuhnya. Bagian kanan dari wajah dan tubuhnya berwarna hitam, sedangkan di\n" +
                            "\t\t  bagian kiri berwarna putih.");
        z.tampilKekuatan("Zetzu mempunyai dua kepribadian, di mana bagian hitam dari wajahnya berbicara dalam Katakana,\n" +
                            "\t\t  sedangkan yang bagian putih menggunakan Kanji dan Kana. Kedua bagian tersebut juga sering\n" +
                            "\t\t  berbicara satu sama lain, dan kadang-kadang juga memiliki pendapat yang berbeda.");
        z.tampilDeskripsi("Zetsu itu kanibal, dia juga sengaja memakan tubuh anggota akatsuki yang telah terbunuh agar mayatnya\n" +
                            "\t\t  tidak di otopsi.");
        
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
