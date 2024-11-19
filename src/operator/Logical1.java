package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&& 연산");
        System.out.println("true && true 면" + (true && true));
        System.out.println("true && false 면" + (true && false));
        System.out.println("false && false 면" + (false && false));

        System.out.println("|| 연산");
        System.out.println("true || true 면" + (true || true));
        System.out.println("true || false 면" + (true || false));
        System.out.println("false || false 면" + (false || false));

        System.out.println("!연산");
        System.out.println("!true 면" + !true);
        System.out.println("!false 면" + !false);

        System.out.println("변수활용");
        boolean a = true;
        boolean b = false;
        boolean result;
        result = a && b;
        System.out.println("result = " + result);
        result = a || b;
        System.out.println("result = " + result);
        result = !a;
        System.out.println("result = " + result);
        result = !b;
        System.out.println("result = " + result);
    }
}
