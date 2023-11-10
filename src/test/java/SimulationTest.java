
import org.junit.Test;
import org.junit.Assert;

public class SimulationTest {

    @Test
    public void simConstructTest(){
        int numberOfDies = 2;
        int numberOfTosses = 100;
        Simulation sim = new Simulation(numberOfDies, numberOfTosses);

        Assert.assertNotNull(sim);
    }

}