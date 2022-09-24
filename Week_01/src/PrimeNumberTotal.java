public class PrimeNumberTotal {
    private static final int START = 3;
    private static final int END = 100;

    private PrimeNumberTotal(){
    }

    public static void calculate(){
        int total = 0;
        for (int i = START; i<END;i++){
            if(isPrime(i)){
                total+=i;
            }
        }
        System.out.println(total);
    }

    private static boolean isPrime(int number){
        int i = 2;
        while (number>2 && i!=number){
            if(number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
