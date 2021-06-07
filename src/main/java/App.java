//UCF COP3330 Summer 2021 Assignment 21 Solution
// *  Copyright 2021 Igli Spaho

//Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.
//
//Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
//
//Example Output
//Please enter the number of the month: 3
//The name of the month is March.
//Constraints
//Use a switch or case statement for this program.
//Use a single output statement for this program.





import java.util.Scanner;

public class App {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of the month:");
        Integer month = in.nextInt();

        String monthString;
        switch (month){
            case 1:
                monthString = "january";
                break;

            case 2:
                monthString = "Febuary";
                break;

            case 3:
                monthString = "March";
                break;

            case 4:
                monthString = "April";
                break;

            case 5:
                monthString = "May";
                break;

            case 6:
                monthString = "June";
                break;

            case 7:
                monthString = "July";
                break;

            case 8:
                monthString = "August";
                break;

            case 9:
                monthString = "September";
                break;

            case 10:
                monthString = "October";
                break;

            case 11:
                monthString = "November";
                break;

            case 12:
                monthString = "December";
                break;

            default:
                monthString ="Not valid";

                

        }
        System.out.print(monthString);
    }
}
