package org.example;

import java.util.Arrays;

public class SumUsingJavaAPI {
    int nums[];

    SumUsingJavaAPI(int nums[]){
        this.nums = nums;
    }

    public int sumUsingStream() {
        return Arrays.stream(nums).sum();
    }
}
