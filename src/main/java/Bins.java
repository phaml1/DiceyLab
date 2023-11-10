
public class Bins {
    int min;
    int max;
    int[] diceRoll;
    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        diceRoll = new int[max - min +1];
    }

    public Integer getBin(int binNum){
        return this.diceRoll[binNum - this.min];
    }

    public void incrementBin(int binNum){
        this.diceRoll[binNum - this.min] ++;
    }
}
