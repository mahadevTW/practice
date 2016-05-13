import WyCash.Dollor;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mahadev on 13/5/16.
 */
public class DollorTest {
    @Test
    public  void testMultiplication(){
        Dollor five = new Dollor(5);
        Dollor product = five.times(2);
        five = new Dollor(5);
        assertEquals(10,product.amount);
        assertEquals(product,five.times(2));
    }
    @Test
    public void
}
