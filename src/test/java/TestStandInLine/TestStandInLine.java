package TestStandInLine;

import StandInLine.StandInLine;
import org.junit.Assert;
import org.junit.Test;

public class TestStandInLine {

    private StandInLine standInLine;

    @Test
    public void testCreatePairs() {
        standInLine = new StandInLine();
        Assert.assertArrayEquals(new int[]{4, 2, 1, 3}, standInLine.reconstruct(new int[] {2, 1, 1, 0}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, standInLine.reconstruct(new int[] {0, 0, 0, 0, 0}));
        Assert.assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, standInLine.reconstruct(new int[] {5, 4, 3, 2, 1, 0}));
        Assert.assertArrayEquals(new int[]{6, 2, 3, 4, 7, 5, 1}, standInLine.reconstruct(new int[] {6, 1, 1, 1, 2, 0, 0}));
    }
}
