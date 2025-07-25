package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumUsingAPITest {
    @Test
    public void testSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        SumUsingJavaAPI sumUsingAPI = new SumUsingJavaAPI(numbers);
        
        int expectedSum = 15;
        int actualSum = sumUsingAPI.sumUsingStream();
        assertEquals(expectedSum, actualSum);
    }
}
