import java.sql.SQLOutput;
import java.util.Random;

public class Dice {
    int numOfDice;

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public int tossAndSum(){
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < numOfDice; i++) {
            int toss = random.nextInt(6) + 1;
            sum += toss;
        }
        System.out.println(sum);
        return sum;
    }

}
