package arrays;

import java.util.Scanner;

public class reverseArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arraay");
        int n = sc.nextInt();
        int []arr= new int [n];
        System.out.println("enter " + n + " eliment");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("reverse array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}