

import org.junit.*;

import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

public class BuyCdTest {

    @Test
    public void cdIsInStock () throws InsufficientStockException {
        CompactDisc cd = new CompactDisc(10);
        cd.buy(1);
        assertEquals(9, cd.getStockCount());
    }

    @Test(expected = InsufficientStockException.class)
    public void insufficientStock() throws InsufficientStockException {
        new CompactDisc(0).buy(1);
    }
}
