package TestTriFibonacci;

import TriFibonacci.TriFibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTriFibonacci {

    private TriFibonacci triFibonacci;

    @Test
    public void testTriFibonacci() {
        triFibonacci = new TriFibonacci();
        assertEquals(6, triFibonacci.findMissingNumber(new int[]{1, 2, 3, -1}));
        assertEquals(110, triFibonacci.findMissingNumber(new int[]{10, 20, 30, 60, -1, 200}));
        assertEquals(-1, triFibonacci.findMissingNumber(new int[]{1, 2, 3, 5, -1}));
        assertEquals(-1, triFibonacci.findMissingNumber(new int[]{1, 1, -1, 2, 3}));
        assertEquals(999985, triFibonacci.findMissingNumber(new int[]{-1, 7, 8, 1000000}));
    }
}

