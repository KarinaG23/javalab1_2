package com.test.app.model.impl.builder;

import com.test.app.model.Arms;
import com.test.app.model.Head;
import com.test.app.model.Human;
import com.test.app.model.Legs;

/**
 * Builder
 */
public class HumanBuilder {

    private Head head;
    private Arms arms;
    private Legs legs;

    public HumanBuilder head(Head head) {
        this.head = head;
        return this;
    }

    public HumanBuilder arms(Arms arms) {
        this.arms = arms;
        return this;
    }

    public HumanBuilder legs(Legs legs) {
        this.legs = legs;
        return this;
    }

    public Human build() {
        return new Human(head, arms, legs);
    }

}
