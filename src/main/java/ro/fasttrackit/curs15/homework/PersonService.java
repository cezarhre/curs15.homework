package ro.fasttrackit.curs15.homework;

import java.util.*;

public class PersonService {

    private final List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        this.persons.addAll(persons != null
                ? persons
                : Collections.emptyList());
    }

    public void addPerson(Person person) {
        if (person != null) {
            this.persons.add(person);
        } else {
            List.of(persons);
        }
    }

    public boolean remPerson(int id) {          //       persons.removeIf(elem -> elem.getId() == id);
        for (Person elem : persons) {
            if (elem.getId() == id) {
                System.out.println(elem);
                return persons.remove(elem);
            }
        }
        throw new IllegalArgumentException("Not a valid Id");
    }

    public List<Person> getAllPersons() {
        return new ArrayList<>(persons);
    }

    public List<Person> getOlderPersonThan(int age) {
        List<Person> result = new ArrayList<>();
        for (Person elem : persons) {
            if (elem.getAge() > age && elem.getAge() > 0 && elem.getAge() < 120) {
                result.add(elem);
            }
        }
        return result;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person elem : persons) {
            if (elem.getName() != null) {
                result.add(elem.getName());
            }
        }
        return result;
    }

    public Person getPersonName(String name) {
        for (Person elem : persons) {
            if (Objects.equals(elem.getName(), name)) {
                return elem;
            }
        }
        throw new IllegalArgumentException("Not a valid name");
    }

    public Person getPersonById(int id) {
        for (Person elem : persons) {
            if (elem.getId() == id) {
                return elem;
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonService that)) return false;
        return Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons);
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "persons=" + persons +
                '}';
    }
}
