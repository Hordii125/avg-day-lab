package org.example;

public class MinUsingFor {
    int nums[];

    MinUsingFor(int nums[]){
        this.nums = nums;
    }

    public int minimumUsingForLoop() {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }
}
