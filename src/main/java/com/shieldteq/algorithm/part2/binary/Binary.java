package com.shieldteq.algorithm.part2.binary;

public class Binary {
    public int countBits(int n) {
        int mask = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if((i&mask) !=0) count++;
            mask = mask << 1;
        }
        return count;
    }
}
