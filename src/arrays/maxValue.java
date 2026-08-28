package arrays;

import java.util.Scanner;

public class maxValue {
    static int maxValue(int[]arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter "+ n +" eliment");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("second max value is "+maxValue (arr));

    }
}
