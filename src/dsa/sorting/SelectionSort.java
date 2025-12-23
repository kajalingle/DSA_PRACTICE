package dsa.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int n, int []arr){
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        selectionSort(n, arr);
    }
}
