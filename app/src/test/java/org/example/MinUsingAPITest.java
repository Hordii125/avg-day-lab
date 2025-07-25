package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinUsingAPITest {
    @Test
    public void testMin() {
        int[] numbers = {1, 2, 3, 4, 5};
        MinUsingJavaAPI minUsingAPI = new MinUsingJavaAPI(numbers);
        
        int expectedMin = 1;
        int actualMin = minUsingAPI.minimumUsingStream();
        assertEquals(expectedMin, actualMin);
    }
}
