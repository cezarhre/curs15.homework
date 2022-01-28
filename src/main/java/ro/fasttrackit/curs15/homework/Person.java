package ro.fasttrackit.curs15.homework;

import java.util.Objects;

public final class Person {
    private final String name;
    private final int age;
    private static int aid = 0;
    private final int id;

    public Person(String name, int age) {
        aid++;
        this.id = aid;
        this.name = name;
        this.age = age;

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return Objects.requireNonNullElse(name, "Not a valid name");
    }

    public int getAge() {
        int result;
        if (age > 0 && age < 120) {
            result = age;
        } else {
            throw new IllegalArgumentException("Not a valid age");
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && getId() == person.getId() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}


