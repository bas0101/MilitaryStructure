package ua.military.structure.entity;

import ua.military.structure.interfaces.Combatcapable;

public abstract class Human implements Combatcapable {
    protected String name = "Name";
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
