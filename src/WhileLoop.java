import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num = 4; num<=n; num++){
            System.out.println(num);
         num+=3;
        }
    }
}
