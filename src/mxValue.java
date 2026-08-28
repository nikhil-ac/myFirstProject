import java.util.Scanner;

public class mxValue {
    static int mxValue(int[]arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int[]arr){
        int mx=mxValue(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMAx = mxValue(arr);
        return secondMAx;
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

        System.out.println("second max value is "+ secondMax(arr));
    }
}
