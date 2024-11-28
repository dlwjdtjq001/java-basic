package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 95;
        String Grade;

        if(score >= 90){
            Grade = "A";
        } else if (score >= 80) {
            Grade = "B";
        } else if (score >= 70){
            Grade = "C";
        } else if (score >= 60) {
            Grade = "D";
        } else {
            Grade = "F";
        }

        System.out.println("score: " + score);
        System.out.println("학점은 " + Grade + " 입니다.");
    }
}
