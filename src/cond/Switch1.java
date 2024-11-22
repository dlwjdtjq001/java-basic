package cond;

public class Switch1 {
    public static void main(String[] args) {
        int Grade = 2;
        int coupon;

        if(Grade == 1){
            coupon = 1000;
        } else if(Grade == 2){
            coupon = 2000;
        } else if(Grade == 3){
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰은 : " + coupon + "원");

    }
}
