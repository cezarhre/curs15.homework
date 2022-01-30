package ro.fasttrackit.curs15.homework;

import java.util.*;

public class PersonService {

    private final List<Person> persons = new ArrayList<>();
    int aid = 0;

    public PersonService(List<Person> persons) {
       for(Person elem : persons){
           addPerson(elem);
        }
    }

    public Person addPerson(Person person) {
        this.persons.add(person);
        person.setId(++aid);
        return person;
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
    public String toString() {
        return "PersonService{" +
                "persons=" + persons +
                '}';
    }
}
