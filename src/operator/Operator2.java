package operator;

public class Operator2 {
    public static void main(String[] args) {
        //문자열과 문자열 더하기
        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);

        //2
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);
        
        //3
        String result3 ="a + b = " + 10;
        System.out.println("result3 = " + result3);
        
        //문자열과 숫자 더하기
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4);
    }
}