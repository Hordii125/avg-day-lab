package org.example;

public class SumUsingFor {
    int nums[];

    SumUsingFor(int nums[]){
        this.nums = nums;
    }

    public int sumUsingForLoop() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
