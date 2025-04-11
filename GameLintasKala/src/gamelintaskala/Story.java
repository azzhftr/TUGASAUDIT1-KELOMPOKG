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
public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;
    
    public Story(Scene startScene, Character player){
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }
    
    public void start(){
        play();
    }
    
    public void play(){
        Scene currentScene = startScene;
        
        while (true){
            if (currentScene == null) break;

            currentScene.displayScene();
            System.out.print("Pilih A / B / C / INFO : ");
            String input = scanner.nextLine().trim().toUpperCase();
            
            if (input.equals("INFO")){
                System.out.println("====== STATUS PEMAIN ======");
                System.out.printf("Name    : %s%n", player.getName());
                System.out.printf("Health  : %d%n", player.getHealth());
                System.out.printf("XP      : %d%n", player.getXP());
                System.out.printf("Item    : %s%n", player.getItem().isEmpty() ? "Tidak ada" : player.getItem());
                System.out.println("============================");
                continue;
            }
            
            switch (input){
                case "A":
                    player.updateStats(currentScene.getHealthA(), currentScene.getXPA());
                    currentScene = currentScene.getNextA();
                    break;
                case "B":
                    player.updateStats(currentScene.getHealthB(), currentScene.getXPB());
                    currentScene = currentScene.getNextB();
                    break;
                case "C":
                    player.updateStats(currentScene.getHealthC(), currentScene.getXPC());
                    currentScene = currentScene.getNextC();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih A, B, C, atau INFO");
            }
            
            if (currentScene == null ||
                (currentScene.getNextA() == null && currentScene.getNextB() == null && currentScene.getNextC() == null)){
                
                System.out.println("\n=== Permainan selesai ===");
                int finalHealth = player.getHealth();
                int finalXP = player.getXP();
                

                String desc = currentScene != null ? currentScene.getDescription() : "";
                if (desc.contains("Scene 11")){
                    if (finalXP > 100 && finalHealth > 100){
                        System.out.println("Ending Baik: YEAYY!!.\nKamu berhasil menemukan artefak penyeimbang waktu dan mendapat penghargaan setelah berhasil kembali ke masa kini.");
                    }
                    
                }
                return;
            }         
        }
        player.updateStats(0, 0);
    }
}
    
    
    
        
        