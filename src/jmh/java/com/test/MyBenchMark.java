package com.test;

import java.util.ArrayList;
import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;

public class MyBenchMark {
    static final int COUNT = 100000;

    @Benchmark
    public List<Boolean> testFillEmptyList() {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < COUNT; i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }

    @Benchmark
    public List<Boolean> testFillAllocatedList() {
        List<Boolean> list = new ArrayList<>(COUNT);
        for (int i = 0; i < COUNT; i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }
}
