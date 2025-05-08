package com.shieldteq.algorithm.part2.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class StringUtilTest {
    @Test
    public void singleNumberTest() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int result = StringUtil.singleNumber(nums);
        log.info("result {}", result);
    }

}
