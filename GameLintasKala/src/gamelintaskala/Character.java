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
public class Character {
    // Untuk menyimpan sttatus karakter
    private String name; // Nama karakter
    private int health; // Kesehatan karakter
    private int XP; // Poin yang didapat oleh pemain ketika menyelesaikan tantangan
    private String item; //item yang akan didapatkan oleh pemain 
    
    
    // Konsturktor untuk inisialisasi nama dan health saat karakter dibuat
    public Character(String name) {
        this.name = name; // Set nama karakter
        this.health = 100; // Set poin kesehatan
        this.XP = 0; // XP awal adalah 0
        this.item = ""; // Tidak membawa item di awal
        
    }
    
    // Metode untuk mengupdate statistik : tambah XP, kurangi/ubah health
    public void updateStats(int healthDelta, int XPGained){
        this.health += healthDelta;
        if (this.health < 0)this.health = 0;    // Cegah nilai negatif
        this.XP += XPGained;
    }
        
  
    // Method untuk mengurangi poin health karakter
    public void takeDamage(int damage) { 
        this.health -= damage;  // Mengurangi health sebanyak nilai damage
        if (this.health < 0) {
            this.health = 0;    // Pastikan health tidak negatif
        }
    }
    
    // Method untuk menambahkan XP ke karakter
    public void addXP(int additionalXP) { 
        this.XP += additionalXP;    // Tambahkan XP ke total XP
    }
    
    // Method untuk mendapatkan nama karakter
    public String getName() {
        return name;
    }
    
    // Method untuk mendapatkan poin kesehatan karakter
    public int getHealth() {
        return this.health;
    }
    
    // Method untuk mendapatkan XP karakter
    public int getXP() {
        return this.XP;
    }
    
    // Method untuk mendapatkan item yang sedang dibawa karakter
    public String getItem() {
        return item;
    }
    
    // Method untuk mengatur item yang dibawa karakter
    public void setItem(String item) {
        this.item = item;
    }
    
    public void setXP(int xp) {
        this.XP = xp;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
}



