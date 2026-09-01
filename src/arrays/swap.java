package arrays;

public class swap {
    static void swapWhithoutno (int a ,int b){
        System.out.println("number befor  swap");
        System.out.println("a : " + a);
        System.out.println("b :" + b);

        a = a + b;
        b = a - b;
        a =  a - b;

        System.out.println("after swaping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);




    }

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
        int a = 3;
        int b = 5;
       // swap(a ,b);
        swapWhithoutno(a ,b);
    }
}
