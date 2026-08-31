package arrays;

public class swap {

    static void  swap(int a ,int b){
        System.out.println("number befor  swap");
        System.out.println("a : " + a);
        System.out.println("b :" + b);

        int temp= a;
         a = b;
         b = temp;
        System.out.println("after swaping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }

    static void main(String[] args) {
        swap(5 , 9);
    }
}
