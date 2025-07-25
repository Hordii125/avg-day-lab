package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinUsingForTest {
    @Test
    public void testMin() {
        int[] numbers = {1, 2, 3, 4, 5};
        MinUsingFor minUsingFor = new MinUsingFor(numbers);
        
        int expectedMin = 1;
        int actualMin = minUsingFor.minimumUsingForLoop();
        assertEquals(expectedMin, actualMin);
    }
}
