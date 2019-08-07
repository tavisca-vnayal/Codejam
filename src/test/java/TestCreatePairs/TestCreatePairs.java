package TestCreatePairs;

import CreatePairs.CreatePairs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCreatePairs {

    private CreatePairs createPairs;

    @Test
    public void testCreatePairs() {
        createPairs = new CreatePairs();
        assertEquals(27, createPairs.maximalSum(new int[] {0, 1, 2, 4, 3, 5}));
        assertEquals(6, createPairs.maximalSum(new int[] {-1, 1, 2, 3}));
        assertEquals(-1, createPairs.maximalSum(new int[] {-1}));
        assertEquals(1, createPairs.maximalSum(new int[] {-1, 0, 1}));
        assertEquals(2, createPairs.maximalSum(new int[] {1, 1}));
    }
}
