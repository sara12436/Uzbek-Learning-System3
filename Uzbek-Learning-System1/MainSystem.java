/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soled;



    public class MainSystem {

    public static void main(String[] args) {

        if (LoginModule.login()) {

            LessonModule.showLesson();

            QuizModule.startQuiz();
        }
    }
}

