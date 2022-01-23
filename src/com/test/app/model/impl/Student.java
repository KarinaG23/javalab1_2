package com.test.app.model.impl;

import com.test.app.model.Arms;
import com.test.app.model.Head;
import com.test.app.model.Human;
import com.test.app.model.Legs;

public class Student extends Human {

    public Student() {
        super(new EmptyHead(), new CrookedArms(), new WeakLegs());
    }

}
