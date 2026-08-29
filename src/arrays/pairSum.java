package arrays;

import java.util.Scanner;

public class pairSum {
    static int pairSum( int []arr, int target){
        int ans = 0;

        for(int i = 0; i<arr.length; i++){
            for (int j= i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){

                    if(arr[i]+arr[j]+arr[k]==target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+ n + " eliment");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target some");
        int target= sc.nextInt();
        System.out.println(pairSum(arr , target));
    }
}
