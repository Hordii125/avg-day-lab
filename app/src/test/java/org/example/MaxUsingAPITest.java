package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxUsingAPITest {
    @Test
    public void testMax() {
        int[] numbers = {1, 2, 3, 4, 5};
        MaxUsingJavaAPI maxUsingAPI = new MaxUsingJavaAPI(numbers);
        
        int expectedMax = 5;
        int actualMax = maxUsingAPI.maximumUsingStream();
        assertEquals(expectedMax, actualMax);
    }
}
