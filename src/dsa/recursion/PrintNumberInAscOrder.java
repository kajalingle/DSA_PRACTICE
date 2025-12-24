package dsa.recursion;

import java.util.Scanner;

public class PrintNumberInAscOrder {
    public static void printNum(int n){
        if(n==11) return;
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String [] args){
        printNum(1);
    }
}
