package org.example;

public class MaxUsingFor {
    int nums[];

    MaxUsingFor(int nums[]){
        this.nums = nums;
    }

    public int maximumUsingForLoop() {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
