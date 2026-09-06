package dsa.javabasicsquestions;

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks=sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }else if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else if(marks>=35){
            System.out.println("Grade D");
        }else{
            System.out.println("fail");
        }
    }
}

/*
Given marks of a student, print on the screen:
Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.
*/