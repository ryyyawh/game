package com.isRey.tebakkonyol;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    public static List<Question> getQuestionsForLevel(int level) {
        List<Question> questions = new ArrayList<>();

if (Stage == 1) {
    questions.add(new Question("Kenapa semut nggak pernah kena macet?", new String[]{
            "Karena dia jalan kaki",  // benar (index 0)
            "Karena dia bisa teleport", 
            "Karena dia kerja shift malam", 
            "Karena dia pakai jalan tikus"
    }, 0));

    questions.add(new Question("Apa yang selalu basah tapi gak pernah kena hujan?", new String[]{
            "Keran bocor", 
            "Laut",  // benar (index 1)
            "SpongeBob", 
            "Es batu"
    }, 1));

    questions.add(new Question("Kenapa kucing suka tidur di laptop?", new String[]{
            "Karena pengen jadi programmer", 
            "Karena laptop panas",  // benar (index 1)
            "Karena dia nyari wifi", 
            "Karena ada tikus di dalam"
    }, 1));

    questions.add(new Question("Apa yang bisa terbang tapi gak punya sayap?", new String[]{
            "Waktu",  // benar (index 0)
            "Pesawat tanpa mesin", 
            "Robot", 
            "Mimpi"
    }, 0));

    questions.add(new Question("Kenapa pisang nggak pernah bingung?", new String[]{
            "Karena sudah matang", 
            "Karena dia selalu kuning",  // benar (index 1)
            "Karena dia pakai helm", 
            "Karena dia buah cerdas"
    }, 1));

    questions.add(new Question("Apa yang berlari tapi nggak pernah capek?", new String[]{
            "Air sungai", 
            "Manusia", 
            "Jam dinding",  // benar (index 2)
            "Mobil mainan"
    }, 2));

    questions.add(new Question("Kenapa es krim gak pernah nangis?", new String[]{
            "Karena dia manis", 
            "Karena dia dingin",  // benar (index 1)
            "Karena dia keras", 
            "Karena dia beku"
    }, 1));

    questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa bikin kamu takut?", new String[]{
            "Hantu",  // benar (index 0)
            "Bayangan", 
            "Kegelapan", 
            "Suara bisikan"
    }, 0));

    questions.add(new Question("Kenapa kucing gak suka air?", new String[]{
            "Karena mereka nggak bisa berenang", 
            "Karena bulunya jadi basah",  // benar (index 1)
            "Karena takut tenggelam", 
            "Karena gak ada sabun"
    }, 1));

    questions.add(new Question("Apa yang nggak punya mulut tapi bisa bicara?", new String[]{
            "Radio",  // benar (index 0)
            "Televisi", 
            "Telepon", 
            "Lampu"
    }, 0));
}

if (Stage == 2) {
    questions.add(new Question("Kenapa kalo malem gaada matahari?", new String[]{
            "Karna dia lagi tidur soalnya kecapean",  // benar (index 0)
            "Mungkin, 
            "Karna dia munculnya pas siang aja", 
            "Karena dia kecapean"
    }, 0));

questions.add(new Question("Kenapa gajah nggak pernah main catur?", new String[]{
        "Karena susah pegang bidak", 
        "Karena dia lebih suka tenis", 
        "Karena nggak ada papan catur sebesar dia",  // benar (index 2)
        "Karena dia lupa aturan"
}, 2));

questions.add(new Question("Apa yang gak bisa dipakai tapi selalu dipakai orang?", new String[]{
        "Waktu",  // benar (index 0)
        "Sepatu", 
        "Kacamata", 
        "Topi"
}, 0));

questions.add(new Question("Kenapa lampu lalu lintas nggak pernah tidur?", new String[]{
        "Karena kerja shift",  // benar (index 0)
        "Karena dia robot", 
        "Karena ada yang jaga", 
        "Karena suka nonton"
}, 0));

questions.add(new Question("Apa yang bisa pecah tapi nggak pernah jatuh?", new String[]{
        "Janji",  // benar (index 0)
        "Kaca", 
        "Gelombang", 
        "Telur"
}, 0));

questions.add(new Question("Kenapa ikan nggak bisa ngomong?", new String[]{
        "Karena nggak punya mulut", 
        "Karena nggak punya suara",  // benar (index 1)
        "Karena air kebisingan", 
        "Karena takut ikan lain"
}, 1));

questions.add(new Question("Apa yang semakin lama dipakai semakin pendek?", new String[]{
        "Pensil",  // benar (index 0)
        "Sabuk", 
        "Rambut", 
        "Waktu"
}, 0));

questions.add(new Question("Kenapa pohon nggak pernah pusing?", new String[]{
        "Karena nggak punya otak",  // benar (index 0)
        "Karena dia diam aja", 
        "Karena selalu di angin", 
        "Karena makan daun"
}, 0));

questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa bikin kita kesepian?", new String[]{
        "Bayangan", 
        "Kesunyian",  // benar (index 1)
        "Angin", 
        "Gelap"
}, 1));

questions.add(new Question("Kenapa semangka nggak bisa lari?", new String[]{
        "Karena dia buah",  // benar (index 0)
        "Karena berat", 
        "Karena nggak punya kaki", 
        "Karena takut"
}, 0));

questions.add(new Question("Apa yang punya gigi tapi nggak bisa makan?", new String[]{
        "Sisir",  // benar (index 0)
        "Pistol", 
        "Rantai", 
        "Gergaji"
}, 0));
}

if (Stage == 3) {
questions.add(new Question("Kenapa kambing gak pernah kuliah?", new String[]{
        "Karena lebih suka makan rumput",  // benar
        "Karena gak punya KTP", 
        "Karena kampusnya bau", 
        "Karena dia sibuk blek"
}, 0));

questions.add(new Question("Apa yang bisa naik tapi nggak pernah turun?", new String[]{
        "Usia",  // benar
        "Balon", 
        "Helium", 
        "Lift rusak"
}, 0));

questions.add(new Question("Kenapa bantal jarang iri?", new String[]{
        "Karena dia udah empuk", 
        "Karena dia selalu dipeluk", 
        "Karena dia gak punya hati",  // benar
        "Karena dia sering tidur"
}, 2));

questions.add(new Question("Apa yang selalu di depan mata tapi gak pernah terlihat?", new String[]{
        "Masa depan",  // benar
        "Kacamata", 
        "Hantu", 
        "Bayangan"
}, 0));

questions.add(new Question("Kenapa ember gak bisa nyanyi?", new String[]{
        "Karena dia cuma wadah",  // benar
        "Karena dia malu", 
        "Karena dia bocor", 
        "Karena dia gak ada nada"
}, 0));

questions.add(new Question("Apa yang jatuh tapi gak pernah pecah?", new String[]{
        "Malam",  // benar
        "Bola plastik", 
        "Es batu dalam kulkas", 
        "HP Nokia"
}, 0));

questions.add(new Question("Kenapa sandal sering hilang satu?", new String[]{
        "Karena dia punya misi rahasia", 
        "Karena angin iri", 
        "Karena yang satu nyasar",  // benar
        "Karena manusia ceroboh"
}, 2));

questions.add(new Question("Apa yang selalu benar walau nggak bisa bicara?", new String[]{
        "Timbangan",  // benar
        "Google", 
        "Kertas Ujian", 
        "Ayam"
}, 0));

questions.add(new Question("Kenapa semut gak pakai sepatu?", new String[]{
        "Karena kebanyakan kaki",  // benar
        "Karena dia kecil", 
        "Karena gak ada toko sepatu semut", 
        "Karena dia gak suka gaya"
}, 0));

questions.add(new Question("Apa yang bisa masuk tapi nggak bisa keluar?", new String[]{
        "Zona nyaman",  // benar
        "Pintu buntu", 
        "Lift error", 
        "Panci terbalik"
}, 0));
}
if (Stage == 4) {
    questions.add(new Question("Kenapa sandal sering hilang di masjid?", new String[]{
            "Karena ikut sholat", 
            "Karena dia jalan sendiri", 
            "Karena diculik alien", 
            "Karena tukar nasib"  // benar
    }, 3));

    questions.add(new Question("Apa yang bisa kamu buka tapi tidak bisa kamu tutup?", new String[]{
            "Botol", 
            "Hati", 
            "Rahasia",  // benar
            "Pintu"
    }, 2));

    questions.add(new Question("Kenapa ayam menyeberang jalan?", new String[]{
            "Nyari nasi uduk", 
            "Karena dia bisa", 
            "Karena ada ayam betina di seberang",  // benar
            "Ikut lomba lari"
    }, 2));

    questions.add(new Question("Apa yang tidak bisa tidur tapi selalu ngantuk?", new String[]{
            "Internet", 
            "Jam weker", 
            "Mata uang", 
            "Mata kuliah"  // benar
    }, 3));

    questions.add(new Question("Kenapa kasur punya sprei?", new String[]{
            "Biar nggak kedinginan", 
            "Biar stylish", 
            "Karena malu kalau telanjang",  // benar
            "Karena perintah ibunya"
    }, 2));

    questions.add(new Question("Apa yang selalu jatuh tapi tidak pernah terluka?", new String[]{
            "Harga diri", 
            "Air hujan", 
            "Bintang jatuh", 
            "Bayangan"  // benar
    }, 3));

    questions.add(new Question("Kenapa spageti nggak bisa jadi penyanyi?", new String[]{
            "Karena dia kaku", 
            "Karena dia terlalu lembek",  // benar
            "Karena gak punya suara", 
            "Karena dia makanan"
    }, 1));

    questions.add(new Question("Apa yang bisa dimakan tapi nggak bikin kenyang?", new String[]{
            "Omongan orang",  // benar
            "Kacang", 
            "Es batu", 
            "Tahu bulat"
    }, 0));

    questions.add(new Question("Kenapa lampu merah bikin orang berhenti?", new String[]{
            "Karena dia galak", 
            "Karena dia bos jalanan", 
            "Karena warnanya tajam", 
            "Karena itu peraturan"  // benar
    }, 3));

    questions.add(new Question("Apa yang bisa nyala tanpa listrik?", new String[]{
            "Hati yang bahagia", 
            "Cinta pertama", 
            "Api cemburu", 
            "Matahari"  // benar
    }, 3));
}

if (Stage == 5) {
    questions.add(new Question("Kenapa koki nggak bisa jadi detektif?", new String[]{
            "Karena dia lebih suka bikin nasi goreng", 
            "Karena dia selalu mencari bahan masakan", 
            "Karena dia nggak bisa menyelidiki", 
            "Karena dia lebih ahli dalam mencuri resep"  // benar
    }, 3));

    questions.add(new Question("Apa yang nggak pernah tidur tapi bisa mengantuk?", new String[]{
            "Matahari", 
            "Bantal", 
            "Jantung", 
            "Jam dinding"  // benar
    }, 3));

    questions.add(new Question("Kenapa televisi sering mogok?", new String[]{
            "Karena kelelahan", 
            "Karena banyak iklan", 
            "Karena nggak punya remote", 
            "Karena dia butuh sinyal"  // benar
    }, 3));

    questions.add(new Question("Apa yang bisa terbang tapi nggak punya sayap?", new String[]{
            "Pesawat", 
            "Mimpi", 
            "Waktu",  // benar
            "Kelelawar"
    }, 2));

    questions.add(new Question("Kenapa kalender selalu penuh dengan tanggal?", new String[]{
            "Karena dia memang penuh", 
            "Karena dia selalu dibaca", 
            "Karena dia ada di kantor", 
            "Karena dia adalah penunjuk waktu"  // benar
    }, 3));

    questions.add(new Question("Kenapa jam selalu ada detiknya?", new String[]{
            "Karena dia nggak mau mati", 
            "Karena itu cara kerjanya",  // benar
            "Karena dia pengen cepat berlalu", 
            "Karena dia ada baterai"
    }, 1));

    questions.add(new Question("Kenapa baju nggak pernah punya anak?", new String[]{
            "Karena mereka nggak bisa beranak", 
            "Karena mereka dijahit", 
            "Karena mereka hanya di-dandani", 
            "Karena mereka dari kain"  // benar
    }, 3));

    questions.add(new Question("Kenapa komputer nggak pernah ketawa?", new String[]{
            "Karena mereka nggak punya humor", 
            "Karena mereka nggak punya mulut", 
            "Karena mereka lebih suka diam", 
            "Karena mereka cuma ngitung angka"  // benar
    }, 1));

    questions.add(new Question("Kenapa kacamata nggak pernah pusing?", new String[]{
            "Karena mereka hanya dipakai di mata", 
            "Karena mereka punya lensa", 
            "Karena mereka nggak punya otak", 
            "Karena mereka selalu fokus"  // benar
    }, 3));

    questions.add(new Question("Apa yang kalau disiram bisa mengembang?", new String[]{
            "Tanaman", 
            "Padi", 
            "Sabun", 
            "Garam"  // benar
    }, 2));
}

if (Stage == 6) {
    questions.add(new Question("Kenapa sapi nggak pernah ikut lomba lari?", new String[]{
            "Karena dia lebih suka makan rumput", 
            "Karena dia berat",  // benar
            "Karena dia nggak punya sepatu lari", 
            "Karena dia takut kalah"
    }, 1));

    questions.add(new Question("Apa yang punya kepala tapi nggak punya otak?", new String[]{
            "Paku", 
            "Botol", 
            "Bantal", 
            "Jam"  // benar
    }, 3));

    questions.add(new Question("Kenapa burung nggak pernah ke sekolah?", new String[]{
            "Karena mereka bisa terbang", 
            "Karena mereka nggak punya buku", 
            "Karena mereka nggak bisa baca",  // benar
            "Karena mereka sibuk cari makan"
    }, 2));

    questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa didengar?", new String[]{
            "Suara",  // benar
            "Bayangan", 
            "Angin", 
            "Lampu"
    }, 0));

    questions.add(new Question("Kenapa handphone sering kehabisan baterai?", new String[]{
            "Karena dipakai terus",  // benar
            "Karena baterainya jelek", 
            "Karena charger rusak", 
            "Karena sinyal buruk"
    }, 0));

    questions.add(new Question("Apa yang bisa dipakai tapi nggak bisa dilihat?", new String[]{
            "Pakaian", 
            "Napas",  // benar
            "Cermin", 
            "Bayangan"
    }, 1));

    questions.add(new Question("Kenapa gajah nggak pernah lupa?", new String[]{
            "Karena otaknya besar",  // benar
            "Karena dia pintar", 
            "Karena dia sering latihan", 
            "Karena dia rajin"
    }, 0));

    questions.add(new Question("Apa yang selalu ada di depanmu tapi nggak bisa kamu sentuh?", new String[]{
            "Angin", 
            "Masa depan",  // benar
            "Bayangan", 
            "Cahaya"
    }, 1));

    questions.add(new Question("Kenapa es batu cepat meleleh di panas?", new String[]{
            "Karena dia takut", 
            "Karena dia es",  // benar
            "Karena dia rapuh", 
            "Karena dia tipis"
    }, 1));

    questions.add(new Question("Apa yang selalu naik tapi nggak pernah turun?", new String[]{
            "Harga",  // benar
            "Balon", 
            "Tangga", 
            "Roket"
    }, 0));
}

if (Stage == 7) {
    questions.add(new Question("Kenapa pisang nggak pernah bingung?", new String[]{
            "Karena dia sudah matang",  // benar
            "Karena dia kuning", 
            "Karena dia pakai helm", 
            "Karena dia buah cerdas"
    }, 0));

    questions.add(new Question("Apa yang nggak punya mulut tapi bisa bicara?", new String[]{
            "Radio",  // benar
            "Televisi", 
            "Telepon", 
            "Lampu"
    }, 0));

    questions.add(new Question("Kenapa hujan nggak pernah update status?", new String[]{
            "Karena dia sibuk jadi air", 
            "Karena dia turun",  // benar
            "Karena dia galau", 
            "Karena dia bukan netizen"
    }, 1));

    questions.add(new Question("Apa yang bisa kamu pegang tapi nggak bisa kamu lihat?", new String[]{
            "Bayangan", 
            "Waktu",  // benar
            "Angin", 
            "Suara"
    }, 1));

    questions.add(new Question("Kenapa semut nggak pernah kena macet?", new String[]{
            "Karena dia jalan kaki",  // benar
            "Karena dia teleport", 
            "Karena dia kerja shift malam", 
            "Karena dia pakai jalan tikus"
    }, 0));

    questions.add(new Question("Apa yang selalu jatuh tapi nggak pernah terluka?", new String[]{
            "Air hujan", 
            "Harga diri", 
            "Bintang jatuh", 
            "Bayangan"  // benar
    }, 3));

    questions.add(new Question("Kenapa kucing gak suka air?", new String[]{
            "Karena takut tenggelam", 
            "Karena bulunya jadi basah",  // benar
            "Karena mereka nggak bisa berenang", 
            "Karena gak ada sabun"
    }, 1));

    questions.add(new Question("Apa yang bisa dimakan tapi nggak bikin kenyang?", new String[]{
            "Es batu", 
            "Omongan orang",  // benar
            "Tahu bulat", 
            "Kacang"
    }, 1));

    questions.add(new Question("Kenapa es krim nggak pernah nangis?", new String[]{
            "Karena dia keras", 
            "Karena dia manis", 
            "Karena dia beku", 
            "Karena dia dingin"  // benar
    }, 3));

    questions.add(new Question("Apa yang berlari tapi nggak pernah capek?", new String[]{
            "Air sungai", 
            "Jam dinding",  // benar
            "Manusia", 
            "Mobil mainan"
    }, 1));
}

if (Stage == 8) {
    questions.add(new Question("Kenapa jam dinding nggak pernah tidur?", new String[]{
            "Karena dia selalu berdetak",  // benar
            "Karena dia tidak butuh tidur", 
            "Karena dia punya baterai", 
            "Karena dia pengingat waktu"
    }, 0));

    questions.add(new Question("Apa yang nggak bisa berbicara tapi bisa menjawab?", new String[]{
            "Telepon", 
            "Radio", 
            "Cermin",  // benar
            "Komputer"
    }, 2));

    questions.add(new Question("Kenapa burung hantu suka malam?", new String[]{
            "Karena dia aktif malam hari",  // benar
            "Karena dia nggak suka siang", 
            "Karena dia takut matahari", 
            "Karena dia suka gelap"
    }, 0));

    questions.add(new Question("Apa yang bisa naik tapi nggak pernah turun?", new String[]{
            "Harga",  // benar
            "Balon", 
            "Tangga", 
            "Roket"
    }, 0));

    questions.add(new Question("Kenapa televisi punya remote?", new String[]{
            "Supaya mudah diatur",  // benar
            "Karena orang malas berdiri", 
            "Karena dia nggak bisa jalan", 
            "Karena dia punya baterai"
    }, 0));

    questions.add(new Question("Apa yang nggak punya tangan tapi bisa memegang?", new String[]{
            "Cangkir", 
            "Pintu",  // benar
            "Kursi", 
            "Meja"
    }, 1));

    questions.add(new Question("Kenapa air laut asin?", new String[]{
            "Karena banyak garam",  // benar
            "Karena tercemar", 
            "Karena ikan-ikan suka asin", 
            "Karena matahari panas"
    }, 0));

    questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa dirasakan?", new String[]{
            "Angin",  // benar
            "Bayangan", 
            "Cahaya", 
            "Suara"
    }, 0));

    questions.add(new Question("Kenapa kucing suka tidur di kotak?", new String[]{
            "Karena nyaman",  // benar
            "Karena dia suka kotak", 
            "Karena dia takut", 
            "Karena dia punya rumah"
    }, 0));

    questions.add(new Question("Apa yang nggak punya kaki tapi bisa berjalan?", new String[]{
            "Jam", 
            "Bayangan", 
            "Waktu",  // benar
            "Mobil"
    }, 2));
}

if (Stage == 9) {
    questions.add(new Question("Kenapa gajah nggak pernah lupa?", new String[]{
            "Karena otaknya besar",  // benar
            "Karena dia pintar", 
            "Karena dia sering latihan", 
            "Karena dia rajin"
    }, 0));

    questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa bikin takut?", new String[]{
            "Hantu",  // benar
            "Bayangan", 
            "Kegelapan", 
            "Suara bisikan"
    }, 0));

    questions.add(new Question("Kenapa pisang selalu kuning?", new String[]{
            "Karena sudah matang",  // benar
            "Karena dia suka matahari", 
            "Karena dia buah cerah", 
            "Karena dia pakai helm"
    }, 0));

    questions.add(new Question("Apa yang bisa pecah tapi nggak pernah jatuh?", new String[]{
            "Gelombang", 
            "Cahaya", 
            "Telur",  // benar
            "Suara"
    }, 2));

    questions.add(new Question("Kenapa jam tangan dipakai di tangan?", new String[]{
            "Karena mudah dilihat",  // benar
            "Karena tradisi", 
            "Karena ada tali", 
            "Karena nyaman"
    }, 0));

    questions.add(new Question("Apa yang bisa terbang tapi nggak punya sayap?", new String[]{
            "Mimpi", 
            "Waktu",  // benar
            "Pesawat", 
            "Robot"
    }, 1));

    questions.add(new Question("Kenapa hujan nggak pernah update status?", new String[]{
            "Karena dia sibuk jadi air", 
            "Karena dia turun",  // benar
            "Karena dia galau", 
            "Karena dia bukan netizen"
    }, 1));

    questions.add(new Question("Apa yang selalu basah tapi nggak pernah kena hujan?", new String[]{
            "Keran bocor", 
            "Laut",  // benar
            "SpongeBob", 
            "Es batu"
    }, 1));

    questions.add(new Question("Kenapa es krim nggak pernah nangis?", new String[]{
            "Karena dia beku", 
            "Karena dia dingin",  // benar
            "Karena dia keras", 
            "Karena dia manis"
    }, 1));

    questions.add(new Question("Apa yang berlari tapi nggak pernah capek?", new String[]{
            "Air sungai", 
            "Jam dinding",  // benar
            "Manusia", 
            "Mobil mainan"
    }, 1));
}

if (Stage == 10) {
    questions.add(new Question("Kenapa semut nggak pernah kena macet?", new String[]{
            "Karena dia jalan kaki",  // benar
            "Karena dia bisa teleport", 
            "Karena dia kerja shift malam", 
            "Karena dia pakai jalan tikus"
    }, 0));

    questions.add(new Question("Apa yang nggak punya mulut tapi bisa bicara?", new String[]{
            "Radio",  // benar
            "Televisi", 
            "Telepon", 
            "Lampu"
    }, 0));

    questions.add(new Question("Kenapa kucing suka tidur di laptop?", new String[]{
            "Karena laptop panas",  // benar
            "Karena dia pengen jadi programmer", 
            "Karena dia nyari wifi", 
            "Karena ada tikus di dalam"
    }, 0));

    questions.add(new Question("Apa yang nggak bisa dilihat tapi bisa bikin kamu takut?", new String[]{
            "Hantu",  // benar
            "Bayangan", 
            "Kegelapan", 
            "Suara bisikan"
    }, 0));

    questions.add(new Question("Kenapa pisang nggak pernah bingung?", new String[]{
            "Karena dia sudah matang",  // benar
            "Karena dia selalu kuning", 
            "Karena dia pakai helm", 
            "Karena dia buah cerdas"
    }, 0));

    questions.add(new Question("Apa yang bisa dimakan tapi nggak bikin kenyang?", new String[]{
            "Omongan orang",  // benar
            "Es batu", 
            "Tahu bulat", 
            "Kacang"
    }, 0));

    questions.add(new Question("Kenapa es krim nggak pernah nangis?", new String[]{
            "Karena dia dingin",  // benar
            "Karena dia manis", 
            "Karena dia keras", 
            "Karena dia beku"
    }, 0));

    questions.add(new Question("Apa yang selalu jatuh tapi nggak pernah terluka?", new String[]{
            "Bayangan",  // benar
            "Air hujan", 
            "Harga diri", 
            "Bintang jatuh"
    }, 0));

    questions.add(new Question("Kenapa kucing gak suka air?", new String[]{
            "Karena bulunya jadi basah",  // benar
            "Karena mereka nggak bisa berenang", 
            "Karena takut tenggelam", 
            "Karena gak ada sabun"
    }, 0));

    questions.add(new Question("Apa yang bisa terbang tapi gak punya sayap?", new String[]{
            "Waktu",  // benar
            "Pesawat tanpa mesin", 
            "Robot", 
            "Mimpi"
    }, 0));
}

if (Stage == 11) {
    questions.add(new Question("Pada Jam Berapa Si Reyy Membuat Pertanyaan level 1?", new String[]{
            "19:00",  // benar
            "20:00", 
            "00:00", 
            "01:00"
    }, 0));

    questions.add(new Question("Apa yang bisa dipakai tapi nggak pernah kotor?", new String[]{
            "Bayangan",
            "Baju", 
            "Sepatu", 
            "Topi"  // benar
    }, 3));

    questions.add(new Question("Kenapa pohon nggak bisa lari?", new String[]{
            "Karena akarnya kuat",  // benar
            "Karena dia berat", 
            "Karena dia nggak punya kaki", 
            "Karena dia takut"
    }, 2));

    questions.add(new Question("Apa yang selalu datang tapi nggak pernah pergi?", new String[]{
            "Besok",  // benar
            "Hari ini", 
            "Kemarin", 
            "Malam"
    }, 0));

    questions.add(new Question("Kenapa ikan nggak bisa main gitar?", new String[]{
            "Karena nggak punya jari",
            "Karena nggak suka musik",  // benar
            "Karena airnya basah", 
            "Karena dia sibuk berenang"
    }, 1));

    questions.add(new Question("Apa yang bisa membuat kamu basah tanpa hujan?", new String[]{
            "Air mata",
            "Keringat", 
            "Minyak",  // benar
            "Laut"
    }, 2));

    questions.add(new Question("Kenapa bulan nggak pernah pusing?", new String[]{
            "Karena dia nggak berputar sendiri",  // benar
            "Karena dia nggak punya kepala", 
            "Karena dia jauh dari bumi", 
            "Karena dia selalu bersinar"
    }, 0));

    questions.add(new Question("Apa yang nggak bisa disentuh tapi bisa dirasakan?", new String[]{
            "Angin",
            "Air", 
            "Api", 
            "Tanah"  // benar
    }, 3));

    questions.add(new Question("Kenapa robot nggak pernah marah?", new String[]{
            "Karena dia nggak punya perasaan",  // benar
            "Karena dia selalu tenang", 
            "Karena dia tidak hidup", 
            "Karena dia punya program"
    }, 0));

    questions.add(new Question("Pada Jam Berapa Reyy Selesai Membuat Game Ini?", new String[]{
            "23:00",
            "00:00", 
            "21:00", // benar
            "20:00"
    }, 2));
}

        return questions;
    }
}