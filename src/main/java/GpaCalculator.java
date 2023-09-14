/*
*  Assignment [Lab 3]
*  Description: [Creating a basic gpa calculator]
*  Name: [Shahriz Malek]
*  ID: [920378989]
*  Class: CSC 211-02
*  Semester: Spring 2020
*/
import java.util.Scanner;

public class GpaCalculator {
    public static void main(String[] args){
        
        double percentage = 0;
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please enter your grade percentage from 0.0 - 100.0: ");
        
        percentage = input.nextDouble();
        
        //If percentage is from 0.0 - 100.0 this if statement will start to check
        if (percentage >= 0.0 && percentage <= 100.0) {
            if (percentage >= 97.0) {
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have an A+ ");
                System.out.println("Your Gpa is 4.0");
            }
            // if its from 93-97 this will work 
            else if (percentage >= 93.0 && percentage < 97.0) {
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have an A ");
                System.out.println("Your Gpa is 4.0");
            }
            // if percentage is from 90-93 this will work
            else if (percentage >= 90.0 && percentage < 93.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have an A- ");
                System.out.println("Your Gpa is 3.7");
            }
            // if percentage is from 87-90 this will work
            else if (percentage >= 87.0 && percentage < 90.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have a B+ ");
                System.out.println("Your Gpa is 3.3");
            }
            // if percentage is from 83-87 this will work
            else if (percentage >= 83.0 && percentage < 87.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have a B ");
                System.out.println("Your Gpa is 3.0");
            }
            // if percentage is from 80-83 this will work
            else if (percentage >= 80.0 && percentage < 83.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You have a B- ");
                System.out.println("Your Gpa is 2.7");
            }
            // if percentage is from 77-80 this will work
            else if (percentage >= 77.0 && percentage < 80.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You have a C+ ");
                System.out.println("Your Gpa is 2.3");
            } 
            // if percentage is from 70-77 this will work
            else if (percentage >= 70.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You have a C ");
                System.out.println("Your Gpa is 2.0");
            }
            else if (percentage >= 67.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Have a D+ ");
                System.out.println("Your Gpa is 1.7");
            }
            else if (percentage >= 60.0){
                System.out.println("You percentage is: " + percentage);
                System.out.println("You have a D");
                System.out.println("Your Gpa is 1.0");
            }
            else {
                System.out.println("You percentage is: " + percentage);
                System.out.println("You Failed Boi!");
                System.out.println("Your Gpa is 0.1");
            }
        }
        // if the user puts a random msg that is not a valid percentage this will work 
        else {
            System.out.println("Please enter a valid percentage!");
        }
    }
}
