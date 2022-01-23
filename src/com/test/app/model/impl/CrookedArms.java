package com.test.app.model.impl;

import com.test.app.model.Arms;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class CrookedArms implements Arms {

    private final List<String> cook = List.of("Break a plate",
            "Add too many paper", "Cut the finger");


    @Override
    public String cookBorsch() {
        return cook.get(new Random().nextInt(3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrookedArms that = (CrookedArms) o;
        return Objects.equals(cook, that.cook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cook);
    }

    @Override
    public String toString() {
        return "CrookedArms{\n" +
                "cook=" + cook +
                "\n}";
    }

    public List<String> getCook() {
        return cook;
    }
}
