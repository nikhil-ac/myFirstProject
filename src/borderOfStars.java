import java.util.Scanner;

public class borderOfStars {

        static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
              int row =8;
            int column= 9;
            for(int i=1; i<=row; i++){
                for(int j = 1; j<=column; j++){
                    if(i ==1 || i ==row  || j==1 || j ==column)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
//for(int i=1;i<=5;i++)
//        {
//        for(int j=1;j<=5;j++)
//        {
//        System.out.print("* ");
//    }
//            System.out.println();
//} agr user se input na lena ho to...
