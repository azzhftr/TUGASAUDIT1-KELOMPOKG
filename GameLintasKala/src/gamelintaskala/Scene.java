/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelintaskala;
import java.util.Scanner;
/**
 *
 * @author Azizah Fitria
 */
public class Scene {
    private String description;                  // Deskripsi adegan dalam scene
    private String pilihanA, pilihanB, pilihanC; // Pilihan tindakan yang bisa diambil oleh pemain
    private int healthA, healthB, healthC;       // Dampak pilihan terhadap kesehatan karakter
    private int XPA, XPB, XPC;                   // Dampak pilihan terhadap pengalaman (XP) karakter
    private Scene nextA, nextB, nextC;           // Arah lanjutan game setelah setiap pilihan
    
    // Konstruktor: membuat scene dengan deskripsi, pilihan, dan dampaknya
    public Scene(
        String description, 
        String pilihanA, String pilihanB, String pilihanC,
        int healthA, int xpA, Scene nextA, 
        int healthB, int xpB, Scene nextB,
        int healthC, int xpC, Scene nextC   
    ) {
        this.description = description;       // Narasi utama adegan
        this.pilihanA = pilihanA;             // Teks pilihan A
        this.pilihanB = pilihanB;             // Teks pilihan B
        this.pilihanC = pilihanC;             // Teks pilihan C
        
        this.healthA = healthA;               // Dampak health dari pilihan A
        this.healthB = healthB;               // Dampak health dari pilihan B
        this.healthC = healthC;               // Dampak health dari pilihan C
        
        this.XPA = xpA;                       // Dampak XP dari pilihan A
        this.XPB = xpB;                       // Dampak XP dari pilihan B
        this.XPC = xpC;                       // Dampak XP dari pilihan C
        
        this.nextA = nextA;
        this.nextB = nextB;
        this.nextC = nextC;
    }
    
    // Menampilkan isi scene ke pemain
    public void displayScene() {
        System.out.println("\n" + description);
        System.out.println("A. " + pilihanA);
        System.out.println("B. " + pilihanB);
        System.out.println("C. " + pilihanC);
        System.out.println("Ketik 'INFO' untuk melihat status kamu.\n");
    }
    
    // Mengeksekusi pilihan pemain dan mengembalikan scene selanjutnya
    public Scene makeChoice(String input, Character player) {
        switch (input) {
           case "A": {
               player.takeDamage(healthA);
               player.addXP(XPA);
               return nextA; 
            }
           
           case "B": {
               player.takeDamage(healthB);
               player.addXP(XPB);
               return nextB;
            }
           
           case "C": {
               player.takeDamage(healthC);
               player.addXP(XPC);
               return nextC;
            }
           
           default: { 
               System.out.println("Pilihan tidak valid.");
               return this; // Kembali ke scene yang sama jika salah input
            }
        }
    }
    
    // Mengatur kelanjutan scene berdasarkan pilihan
    public void setNextScenes(Scene nextA, Scene nextB, Scene nextC) {
        this.nextA = nextA;
        this.nextB = nextB;
        this.nextC = nextC;
    }
    
    // Getter untuk masing-masing atribut
    public String getDescription() {
        return description;
    }
    
    public String getPilihanA() {
        return pilihanA;
    }
    
    public String getPilihanB() {
        return pilihanB;
    }
    
    public String getPilihanC() {
         return pilihanC;
    }
    
    public int getHealthA() {
        return healthA;
    }
    
    public int getHealthB() {
        return healthB;
    }
    
    public int getHealthC() {
        return healthC;
    }
    
     public int getXPA() {
        return XPA;
    }

    public int getXPB() {
        return XPB;
    }

    public int getXPC() {
        return XPC;
    }
    
    public Scene getNextA() {
        return nextA;
    }

    public Scene getNextB() {
        return nextB;
    }

    public Scene getNextC() {
        return nextC;
    }
}


