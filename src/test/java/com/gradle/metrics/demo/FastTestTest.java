package com.gradle.metrics.demo;


import org.junit.Test;

public class FastTestTest {

    @Test
    public void testOne() {
        assert new FastTest().fast().equals("cool!");
    }

    @Test
    public void testTwo() throws InterruptedException {
        assert new FastTest().slow().equals("not cool");
    }
}
