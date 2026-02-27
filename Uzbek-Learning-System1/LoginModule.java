/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soled;


    import java.util.Scanner;

public class LoginModule {

    public static boolean login() {
        Scanner input = new Scanner(System.in);

        String username = "sara";
        String password = "1234";

        System.out.print("Enter username: ");
        String u = input.nextLine();

        System.out.print("Enter password: ");
        String p = input.nextLine();

        if (u.equals(username) && p.equals(password)) {
            System.out.println("Login successful ✅");
            return true;
        } else {
            System.out.println("Wrong username or password ❌");
            return false;
        }
    }
      public static void main(String[] args) {
        login();
      }
      
}

