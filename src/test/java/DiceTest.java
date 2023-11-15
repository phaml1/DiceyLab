import org.junit.Assert;
import org.junit.Test;
public class DiceTest {

    //@Test
    //public void

    @Test
    public void diceConstruct(){
        Dice dice = new Dice(2);
        int expected = 2;
        int actual = dice.numOfDice;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumOfDiceTest(){
        Dice dice = new Dice(2);
        int expected = 2;
        int actual = dice.getNumOfDice();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void tossAndSum(){
        Dice dice = new Dice(2);
        int min = 2;
        int max = 12;
        Assert.assertTrue(dice.tossAndSum()>=min && dice.tossAndSum()<=max);

    }
}
