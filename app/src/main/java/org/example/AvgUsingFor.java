package org.example;

public class AvgUsingFor {
    int nums[];

    AvgUsingFor(int nums[]) {
        this.nums = nums;
    }

    public int averageUsingForLoop() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}
