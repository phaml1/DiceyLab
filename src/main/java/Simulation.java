public class Simulation {
    int numberOfDies;
    int numberOfTosses;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
}

    // runSim method
    public void runSim(){
        Dice dice = new Dice(this.numberOfDies);
        Bins bins = new Bins(this.numberOfDies, this.numberOfDies*6);

        for (int i = 0; i < this.numberOfTosses; i++){
            bins.incrementBin(dice.tossAndSum());
        }
    }
    //print result
}
