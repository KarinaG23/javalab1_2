package com.test.app.service;

import com.test.app.model.Human;
import com.test.app.model.impl.*;
import com.test.app.model.impl.builder.HumanBuilder;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HumanService {

    private final static Random RANDOM = new Random(System.currentTimeMillis());

    public List<Human> generateHumans(int count) {
        return IntStream.range(0, count)
                .mapToObj(this::buildRandomHuman)
                .collect(Collectors.toList());
    }

    public List<Human> filterDullHuman(List<Human> humans) {
        return humans.stream()
                .filter(human -> human.getHead() instanceof WiseHead)
                .sorted(new HumanComparator())
                .collect(Collectors.toList());
    }

    public List<Human> filterWeakHuman(List<Human> humans) {
        return humans.stream()
                .filter(human -> human.getArms() instanceof CrookedArms && human.getLegs() instanceof WeakLegs)
                .collect(Collectors.toList());
    }

    private Human buildRandomHuman(int count) {
        return new HumanBuilder()
                .legs(RANDOM.nextBoolean() ? new StrongLegs() : new WeakLegs())
                .head(RANDOM.nextBoolean() ? new EmptyHead() : new WiseHead())
                .arms(RANDOM.nextBoolean() ? new CrookedArms() : new GoldArms())
                .build();
    }

}
