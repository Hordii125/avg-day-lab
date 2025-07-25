package org.example;

import java.util.Arrays;

public class MaxUsingJavaAPI {
    int nums[];

    MaxUsingJavaAPI(int nums[]){
        this.nums = nums;
    }

    public int maximumUsingStream() {
        return Arrays.stream(nums).max().orElseThrow();
    }
}
