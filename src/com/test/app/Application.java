package com.test.app;

import com.test.app.model.Human;
import com.test.app.model.impl.*;
import com.test.app.model.impl.builder.HumanBuilder;
import com.test.app.service.HumanService;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Human human = new HumanBuilder()
                .arms(new GoldArms())
                .head(new EmptyHead())
                .legs(new StrongLegs())
                .build();

        System.out.println(student);
        printEmptySpace(2);

        System.out.println(teacher);
        printEmptySpace(2);

        System.out.println(human);
        printEmptySpace(5);

        HumanService service = new HumanService();
        List<Human> humans = service.generateHumans(10);
        System.out.println(humans);
        printEmptySpace(5);

        System.out.println(service.filterDullHuman(humans));
        printEmptySpace(5);

        System.out.println(service.filterWeakHuman(humans));
    }

    private static void printEmptySpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println();
        }
    }

}
