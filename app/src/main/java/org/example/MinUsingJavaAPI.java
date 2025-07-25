package org.example;

import java.util.Arrays;

public class MinUsingJavaAPI {
    int nums[];

    MinUsingJavaAPI(int nums[]){
        this.nums = nums;
    }

    public int minimumUsingStream() {
        return Arrays.stream(nums).min().orElseThrow();
    }
}
