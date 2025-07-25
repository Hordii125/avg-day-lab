package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumUsingForTest {
    @Test
    public void testSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        SumUsingFor sumUsingFor = new SumUsingFor(numbers);
        
        int expectedSum = 15;
        int actualSum = sumUsingFor.sumUsingForLoop();
        assertEquals(expectedSum, actualSum);
    }
}
