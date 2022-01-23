package com.test.app.model.impl;

import com.test.app.model.Legs;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class StrongLegs implements Legs {

    private final List<String> run = List.of("Fast as a wind",
            "Powerful kick", "Unlimited strength");

    @Override
    public String walk() {
        return run.get(new Random().nextInt(3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrongLegs weakLegs = (StrongLegs) o;
        return Objects.equals(run, weakLegs.run);
    }

    @Override
    public int hashCode() {
        return Objects.hash(run);
    }

    @Override
    public String toString() {
        return "StrongLegs{\n" +
                "run=" + run +
                "\n}";
    }

    public List<String> getRun() {
        return run;
    }
}
