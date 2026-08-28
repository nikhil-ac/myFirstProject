import java.util.Scanner;

class person {
   void usingLoop(){
    int [] arr = {321, 74, 47, 27, 25,2 ,74,55};
    int x = 74;
    int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                ans = i;
                break;
            }
            }
       System.out.println("find the "+ x + " at the " + ans + " position");
        }
   }
 public class main {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
         System.out.println("enter " + n + " eliment ");
         for(int i = 0; i<arr.length; i++) {
             arr[i] = sc.nextInt();
         }
            for(int i =0; i<n; i++){
                System.out.print( arr[i]+ " ");
         }
     }
 }

