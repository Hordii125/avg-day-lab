package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxUsingForTest {
    @Test
    public void testMax() {
        int[] numbers = {1, 2, 3, 4, 5};
        MaxUsingFor maxUsingFor = new MaxUsingFor(numbers);
        
        int expectedMax = 5;
        int actualMax = maxUsingFor.maximumUsingForLoop();
        assertEquals(expectedMax, actualMax);
    }
}
