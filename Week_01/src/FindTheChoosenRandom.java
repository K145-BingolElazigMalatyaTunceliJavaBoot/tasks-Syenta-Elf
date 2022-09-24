import java.security.SecureRandom;
import java.util.Random;

public class FindTheChoosenRandom {
    private static int RANDOM_START = 0;
    private static int RANDOM_END = 500;
    private static int BOTTOM_LIMIT = 50;
    private static int TOP_LIMIT = 100;

    private FindTheChoosenRandom(){
    }

    public static void calculate(){

        Random random = new Random();
        int randomNumber = BOTTOM_LIMIT+(int)(Math.random()* TOP_LIMIT);
        int counter = 1;
        while (true){
            if(randomNumber>=BOTTOM_LIMIT && TOP_LIMIT>=randomNumber){
                System.out.println("Tried " +counter+ " times for find the number. Finded this: "+randomNumber);
                break;
            }
            counter++;
            randomNumber  = random.nextInt(RANDOM_END);
        }
    }
}
