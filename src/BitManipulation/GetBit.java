package BitManipulation;

import java.util.Scanner;

public class GetBit {
     static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();
        System.out.println("Enter Position Of bit :");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int ans=bitMask&n;
        if(ans==0){
            System.out.println("no is 0");
        }else{
            System.out.println("no is 1");
        }
     }
}
