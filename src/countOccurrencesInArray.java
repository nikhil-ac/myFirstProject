import java.util.Scanner;

public class countOccurrencesInArray {
    static int countoccurances(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " eliment");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("enter x");
        int x= sc.nextInt();
        System.out.println("COUNT OF X = " + countoccurances(arr ,x));
    }
}

