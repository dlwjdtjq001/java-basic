package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if(age <8){
            System.out.println("미취학");
        }
        if(age >= 8 && age < 14){
            System.out.println("초등학생");
        }
        if(age >= 14 && age <17){
            System.out.println("중학생");
        }
        if(age >= 17 && age <20){
            System.out.println("고등학생");
        }
        if(age >= 20){
            System.out.println("성인");
        }
    }
}
