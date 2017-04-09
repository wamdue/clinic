package net.clinic.logic.pets;

/**
 * @author Wamdue
 * @version 1.0
 * @since 05.04.2017
 */
public class Cat implements Pet
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return getName();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Кот: " + name +", возраст " + age + " лет.";
    }
}
