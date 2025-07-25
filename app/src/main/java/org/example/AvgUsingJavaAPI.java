package org.example;

import java.util.Arrays;

public class AvgUsingJavaAPI {
    int nums[];

    AvgUsingJavaAPI(int nums[]){
        this.nums = nums;
    }

    public int averageUsingStream() {
        return (int) Arrays.stream(nums).average().orElseThrow();
    }
}
