package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvgUsingAPITest {
    @Test
    public void testAverageCalculation() {
        int[] numbers = {1, 2, 3, 4, 5};
        AvgUsingJavaAPI avgUsingAPI = new AvgUsingJavaAPI(numbers);

        // Example test case for average calculation
        
        double expectedAverage = 3.0;
        double actualAverage = avgUsingAPI.averageUsingStream();
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
}
