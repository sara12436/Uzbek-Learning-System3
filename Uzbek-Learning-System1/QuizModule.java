/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soled;



    import java.util.Scanner;

public class QuizModule {

    public static void startQuiz() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("=== Quiz ===");

        System.out.print("Salom means? ");
        String q1 = input.nextLine();
        if (q1.equalsIgnoreCase("hello")) score++;

        System.out.print("Rahmat means? ");
        String q2 = input.nextLine();
        if (q2.equalsIgnoreCase("thank you")) score++;

        System.out.println("Your score: " + score + "/2");
    }
}

