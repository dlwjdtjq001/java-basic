package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = a++; // a는 2 b는 1
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 1;
        b = 0;
        b = ++a; // a는 2 b는 2
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
