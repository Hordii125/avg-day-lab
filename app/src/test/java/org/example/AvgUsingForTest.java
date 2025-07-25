package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvgUsingForTest {
    @Test
    public void testAverage() {
        int[] numbers = {1, 2, 3, 4, 5};
        AvgUsingFor avgUsingAPI = new AvgUsingFor(numbers);

        
        double expectedAverage = 3.0;
        double actualAverage = avgUsingAPI.averageUsingForLoop();
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
}
