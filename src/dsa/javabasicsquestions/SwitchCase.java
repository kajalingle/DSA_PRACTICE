package dsa.javabasicsquestions;

import java.util.Scanner;

public class SwitchCase {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String day = switch (n) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid value";
        };
        System.out.println(day);

//        switch (n){
//            case 1: System.out.println("Monday");
//            break;
//            case 2: System.out.println("Tuesday");
//            break;
//            case 3: System.out.println("Wednesday");
//            break;
//            case 4: System.out.println("Thursday");
//            break;
//            case 5: System.out.println("Friday");
//            break;
//            case 6: System.out.println("Saturday");
//            break;
//            case 7: System.out.println("Sunday");
//            break;
//            default:
//                System.out.println("Invalid value");
//        }
    }
}

/*
Problem Statement
Given the integer day denoting the day number, print on the screen which day of the week it is.
Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
Ensure only the 1st letter of the answer is capitalised.
*/







