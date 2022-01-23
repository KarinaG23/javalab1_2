package com.test.app.model;

import com.test.app.model.impl.WiseHead;

import java.util.Objects;

/**
 * Basic human
 */
public class Human implements Comparable<Human>{

    private Head head;
    private Arms arms;
    private Legs legs;

    /**
     * Human...
     * @param head every human have a head, even if it's empty
     * @param arms could be null, thinks happens
     * @param legs could be null, thinks happens
     */
    public Human(Head head, Arms arms, Legs legs) {
        if (head == null) throw new NullPointerException("Human should have a head!!!");
        this.head = head;
        this.arms = arms;
        this.legs = legs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(head, human.head) &&
                Objects.equals(arms, human.arms) &&
                Objects.equals(legs, human.legs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, arms, legs);
    }

    @Override
    public String toString() {
        return "Human{\n" +
                "head=" + head +
                ", body=" + arms +
                ", legs=" + legs +
                "\n}";
    }

    public Head getHead() {
        return head;
    }

    public Human setHead(Head head) {
        if (head == null) throw new NullPointerException("Human should have a head!!!");
        this.head = head;
        return this;
    }

    public Arms getArms() {
        return arms;
    }

    public Human setArms(Arms arms) {
        this.arms = arms;
        return this;
    }

    public Legs getLegs() {
        return legs;
    }

    public Human setLegs(Legs legs) {
        this.legs = legs;
        return this;
    }

    @Override
    public int compareTo(Human o) {
        if (this.head instanceof WiseHead) {
            return o.head instanceof WiseHead ? 0 : 1;
        } else {
            return o.head instanceof WiseHead ? -1 : 0;
        }
    }

}
