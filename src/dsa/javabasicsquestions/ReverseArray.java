package dsa.javabasicsquestions;

import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(n, arr);
    }

    public static void reverseArray(int n, int arr[]){
        int i;
        int j;
        for(i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

/*
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]

Example 2
Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]
Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].
 */

