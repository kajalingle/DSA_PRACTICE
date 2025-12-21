package bitmanipulation;

import java.util.Scanner;

public class updateBit {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();
        System.out.println("Enter Position Of bit :");
        int pos=sc.nextInt();
        System.out.println("Enter operation :");
        int oper=sc.nextInt();
        int bitMask=1<<pos;
        if(oper==1){
            System.out.println(bitMask|n);
        }else{
            System.out.println((~bitMask)&n);
        }
    }
}
