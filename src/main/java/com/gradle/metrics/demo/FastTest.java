package com.gradle.metrics.demo;

public class FastTest {

    public String fast() {
        return "cool!";
    }

    public String slow() throws InterruptedException {
        Thread.sleep(2000);
        return "not cool";
    }
}
