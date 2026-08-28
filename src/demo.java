class algebra {
    int a = 15;
    int b = 10;

    int add(){
        return a+b;
    }
    int sub(){
        return a - b;
    }
}
class algebra2{
    int c = 4;
    int d = 2;

    int multi(){
        return c*d;

    }
    int division(){
        return c / d;
    }

}

public class demo {
    static void main(String[] args) {

        algebra obj = new algebra();

        System.out.println(obj.add());
        System.out.println(obj.sub());

        algebra2 obj2 = new algebra2();

        System.out.println(obj2.multi());
        System.out.println(obj2.division());


    }
}
