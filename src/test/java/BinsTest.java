
import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testBinConstruct(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);

        Assert.assertNotNull(bins);
    }

    @Test
    public void testGetBin(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);

        int actual = bins.getBin(4);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void incrementBinTest(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);

        bins.incrementBin(3);
        Assert.assertEquals(1, bins.getBin(3).intValue());
    }
}
