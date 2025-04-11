/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamelintaskala;
import java.util.Scanner;


/**
 *
 * @author Azizah Fitria
 */
public class GameLintasKala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan sambutan awal kepada pemain
        System.out.println("===== Selamat datang di Lintas Kala =====");
        System.out.print("Masukkan nama karakter: ");
        String name = scanner.nextLine();
        
        // Membuat objek karakter berdasarkan nama input pemain
        Character player = new Character(name);
            
        // Membuat Scene
        
        // Scene 11 - ENDING BAIK 
        Scene scene11 = new Scene(
        "Scene 11 = Kamu berhasil mengambil artefak dan kembali ke masa kini. Dunia terselamatkan dan kamu mendapat penghargaan!.",
        "Terima penghargaan","Tinggalkan dunia penelitian","Tutup proyek mesin waktu",
            0, 0, null,
            0, 0, null,
            0, 0, null
        );
        
        
        // Scene 10 - Dunia Hampir Runtuh
        Scene scene10 = new Scene(
        "Scene 10 = Kamu belum berhasil mengambil artefak yang menjaga keseimbangan waktu tepat pada waktunya.Retakan waktu mulai meluas, dan dunia perlahan-lahan hancur dalam kekacauan. Namun, di tengah kehancuran, kamu melihat satu celah harapan—sebuah portal kecil yang masih menyala.",
        "Melompat ke dalam portal terakhir", "Diam", "Menerima kehancuran",
            +0, +0, scene11,
            -10, -10, null,
            -10, -10, null          
        );
        
        
        // Scene 9 - PERTEMPURAN BESAR TERJADI!
        Scene scene9 = new Scene(
        "Scene 9 = Tanpa sengaja kamu masuk ke medan pertempuran besar antara dua pasukan dan terjebak di tengah-tengah medan perang.",
        "Bersembunyi", "Lari", "Diam dan menunggu",
            +15, +10, scene10,
            +5, +2, scene10,
            -20, 0,scene10
        );
        
        // Scene 8 - RERUNTUHAN DI KOTA TUA
        Scene scene8 = new Scene(
        "Scene 8 = Kamu menemukan reruntuhan yang dipenuhi jebakan kuno dan sisa teknologi asing.",
        "Jelajahi", "Hancurkan reruntuhan", "Cari jalan lain",
            +20, +20, scene9,
            -15, 0, scene9,
            +10, +5, scene9 
        );
        
        // Scene 7 - TERJEBAK DI MARKAS MUSUH
        Scene scene7 = new Scene(
        "Scene 7 = Kamu mencoba menyusup lebih dalam, namun ternyata jalur ini adalah jebakan. Kamu terkunci di ruang bawah tanah markas musuh.",
        "Coba kabur", "Menyamar", "Menyerah",
            +30, +10, scene8,
            +10, 5, scene8,
            -10, 0, scene8
        );
        
        // Scene 6 - MENEMUKAN TEKA-TEKI
        Scene scene6 = new Scene(
        "Scene 6 = Setelah itu kamu menemukan ruangan misterius penuh simbol kuno. Di tengah ruangan ada teka-teki.\nAku bukan hidup, tapi bisa tumbuh. Aku tidak punya paru-paru, tapi butuh udara. Aku bukan mulut, tapi bisa mati jika diberi air. Apa aku?",
        "Api", "Tanaman", "Pasir",
            +30, +30, scene7, // Jawaban benar
            +5, 2, scene7,
            -20, 0, scene7
   
        );
        
        // Scene 5 - Lokasi artefak
        Scene scene5 = new Scene(
        "Scene 5 = Kamu sampai di kuil tua tempat artefak disimpan. Tapi dijaga oleh robot kuno.",
        "Melawan robot", "Mencari jalan alternatif", "Negosiasi dengan robot kuno",
            -10, +5, scene6,
            +30, +25, scene6,
            -20, 0, scene6

        );
        
        // Scene 4 - Misi pencarian artefak
        Scene scene4 = new Scene(
        "Scene 4 = Kamu mendapat tugas penting untuk menemukan artefak penyeimbang waktu.",
        "Pergi sendiri", "Ajak pasukan", "Tolak tugas ini",
            +10, +3, scene5,
            +20, +25, scene5,
            -5, 0, scene5
        );
        
        // Scene 3 - PERKEMAHAN RAHASIA
        Scene scene3 = new Scene(
        "Scene 3 = Kamu dibawa ke perkemahan rahasia. Mereka meminta bukti bahwa kamu bukan musuh.",
        "Membantu mereka", "Memberikan informasi tentang masa depan", "Menolak dan kabur",
            +10, +25, scene4,
            +12, 4, scene4,
            -15, 0, scene4
                
        );
        
        // Scene 2 - BERTEMU PASUKAN PEMBERONTAK
        Scene scene2 = new Scene(
        "Scene 2 = Kamu bertemu dengan pasukan pemberontak yang mencurigaimu sebagai mata-mata musuh.\nApa yang akan kamu lakukan?",
        "Menyerahkan diri", "Berbohong dan menyamar", "Kabur dengan cepat",
            +10, 2, scene3,
            +15, +20, scene3,
            -10, 0, scene3
 
        );
        
        
        // Scene 1 - PETUALANGAN DIMULAI
        Scene scene1 = new Scene(
        "Scene 1 = Kamu adalah seorang peneliti yang tengah menguji mesin waktu.\nSaat percobaan dimulai, kamu tersedot ke masa lalu yang penuh peperangan.\nPilih jalanmu untuk memulai petualangan!",
        "Menjelajahi hutan sekitar", "Mencari tempat aman", "Berteriak meminta bantuan",
            +15, +15, scene2,       //Jawaban Benar
            +5, +5, scene2,
            -10, 0, scene2
        );
        
        // Memulai permainan dari scene pertama
        Story story = new Story(scene1, player);
        story.start();    
    }
}
