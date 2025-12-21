package dsa.bitmanipulation;

import java.util.Scanner;

public class ClearBit {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();
        System.out.println("Enter Position Of bit :");
        int pos=sc.nextInt();
        int bitMask=~(1<<pos);
        System.out.println(bitMask&n);
    }
}
