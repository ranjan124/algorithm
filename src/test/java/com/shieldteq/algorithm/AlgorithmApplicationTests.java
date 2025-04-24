package com.shieldteq.algorithm;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class AlgorithmApplicationTests {

    @Test
    void noTest() {
        TestUser user = TestUser.builder().name("Model").age(10).build();
        log.info("No test {}", user);
    }

}
