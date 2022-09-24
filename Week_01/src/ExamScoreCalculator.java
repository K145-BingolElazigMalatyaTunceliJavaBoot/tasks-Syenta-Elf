import java.util.Random;

public class ExamScoreCalculator {
    private static final Random random = new Random();
    private static int firstScore = random.nextInt(100);
    private static int secondScore = random.nextInt(100);
    private static final int AA = 100;
    private static final int BB = 70;
    private static final int DC = 50;
    private static final int FF = 35;

    private ExamScoreCalculator(){
    }

    public static void calculate(){
        int finalScore = (firstScore + secondScore)/2;
        result(finalScore);
    }
    public static void calculate(int fScore, int sScore){
        if (!(fScore > 0 && sScore > 0)){
            throw new UnsupportedOperationException();
    }
        int finalScore = (fScore + sScore)/2;
        result(finalScore);
    }

    private static void result(int finalScore){
        if(AA>finalScore && finalScore>BB){
            System.out.println("You got AA, score = " + finalScore);
        } else if (BB>finalScore && finalScore>DC) {
            System.out.println("You got BB, score = " + finalScore);
        }else if(DC>finalScore && finalScore>FF){
            System.out.println("You got DC, score = " + finalScore);
        }else{
            System.out.println("You got FF, score = " + finalScore);
        }
    }
}
