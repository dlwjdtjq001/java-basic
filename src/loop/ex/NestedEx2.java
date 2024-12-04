package loop.ex;

public class NestedEx2 { // 거꾸로 별찍기
    public static void main(String[] args){
        int rows = 8;
        int t = rows;

        for(int i = 1; i <= rows; i++){
            for(int j = t; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
            t--;
        }
    }
}
