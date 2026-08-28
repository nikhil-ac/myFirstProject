package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrShorting {
    static void smallestandlargestno(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static boolean isShorted ( int[] arr){
        boolean cheak = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                cheak = false;
                break;
            }
        }
        return cheak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " eliment");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(" eliment is shorted and conndition is = " + isShorted(arr));
        smallestandlargestno(arr);
    }
}
