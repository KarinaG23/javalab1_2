package com.test.app.model.impl;

import com.test.app.model.Head;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class WiseHead implements Head {

    private final List<String> thoughts = List.of("Java is the best language",
            "*take a break is a part of work*", "Readable code better then 200 lines of documentation");

    @Override
    public String think() {
        return thoughts.get(new Random().nextInt(3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WiseHead emptyHead = (WiseHead) o;
        return Objects.equals(thoughts, emptyHead.thoughts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thoughts);
    }

    @Override
    public String toString() {
        return "WiseHead{\n" +
                "thoughts=" + thoughts +
                "\n}";
    }

    public List<String> getThoughts() {
        return thoughts;
    }
}
