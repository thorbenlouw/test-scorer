package com.github.stevesmithcd.testscorer.domain;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

public class TestReport implements Iterable<Test>, Comparable<TestReport> {
    private final String name;
    private final LocalDateTime creationTimestamp;
    private final Set<Test> tests;

    public TestReport(String name, LocalDateTime creationTimestamp, Set<Test> tests) {
        this.name = name;
        this.creationTimestamp = creationTimestamp;
        this.tests = tests;
    }

    @Override
    public Iterator<Test> iterator() {
        return tests.iterator();
    }

    @Override
    public int compareTo(TestReport o) {
        return creationTimestamp.equals(o.creationTimestamp) ? name.compareTo(o.name) : creationTimestamp.compareTo(o.creationTimestamp);
    }
}
