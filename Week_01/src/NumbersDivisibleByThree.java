public class NumbersDivisibleByThree {
    private static final int START = 200;
    private static final int END = 500;
    private static final int DIVIDER = 3;

    private NumbersDivisibleByThree(){
    }

    public static void calculate(){
        int total = 0;
        for (int i = START; i<END ; i++){
            if (!isDivisibleByThree(i)){
                total += i;
            }
        }
        System.out.println(total);
    }

    private static boolean isDivisibleByThree(int number){
        if (number%3==0){
            return true;
        }
        return false;
    }
}
