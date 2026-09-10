package dsa.javabasicsquestions;

import java.util.Scanner;

public class ForLoop {
      static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Low Number:");
        int low=sc.nextInt();
        System.out.println("Enter High Number:");
        int high=sc.nextInt();
        int sum=sumOfLowToHigh(low, high);
        System.out.println(sum);
    }

    public static int sumOfLowToHigh(int low, int high){
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=i;
        }
        return sum;
    }
}
/*
Problem Statement:
Given two integers low and high, return the sum of all integers from low to high inclusive.
Example 1
Input: low = 1, high = 5
Output: 15
Explanation: 1 + 2 + 3 + 4 + 5 = 15

Example 2
Input: low = 3, high = 7
Output: 25
Explanation: 3 + 4 + 5 + 6 + 7 = 25
*/