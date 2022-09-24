public class Main {
    public static void main(String[] args) {
        PrimeNumberTotal.calculate();
        NumbersDivisibleByThree.calculate();
        FindTheChoosenRandom.calculate();
        try{
            ExamScoreCalculator.calculate();
            ExamScoreCalculator.calculate(50,-50);
        }catch (UnsupportedOperationException e){
            System.out.println("Numbers less than zero cannot be entered.");
            throw e;
        }
    }
}