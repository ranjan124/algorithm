package com.shieldteq.algorithm.part2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class ExamplesUtilTest {
    @Test
    public void majorityElementTest() {
        int[] num = new int[]{2, 3, 2, 1, 3, 1, 3, 1, 3, 3, 2, 2};
        int i = ExamplesUtil.majorityElement(num);
        log.info("value : {}", i);
    }

    @Test
    public void romanToInt() {
        int i = ExamplesUtil.romanToInt("MCMXCIV");
        log.info("int : {}", i);
    }

    @Test
    public void maxProfitTest() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int i = ExamplesUtil.maxProfit(prices);
        log.info("arrays : {}", i);
    }
}
