package dsa.javabasicsquestions;

import java.util.Scanner;

public class WhileLoop {
     static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int sum=sum(a);
        System.out.println(sum);
    }

    public static int sum(int a){
        int sum=0;

        while(a<=50){
           sum+=a;
           a++;
        }
        return sum;
    }
}

/*
Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
A number ends with digit d if its last digit is d.

Example 1
Input: d = 1
Output: 12300

Explanation:
The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491
Their sum is 12300.
 */