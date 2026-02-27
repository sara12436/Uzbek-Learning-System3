/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soled;


public class ResultModule {
   
    public static void showResult(int score, int total) {
        System.out.println("=== Result ===");
        System.out.println("Score: " + score + "/" + total);

        if (score == total) {
            System.out.println("Excellent 🎉");
        } else if (score > 0) {
            System.out.println("Good 👍");
        } else {
            System.out.println("Try again ❌");
        }
    }
}

