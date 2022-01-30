package ro.fasttrackit.curs15.homework;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> person1 = new ArrayList<>();
                    person1.add(new Person("Costel",35));
                    person1.add(new Person("Dan",45));
                    person1.add(new Person("Ionel",30));
                    person1.add(new Person("Dorina",55));

        PersonService personService = new PersonService(person1);
        System.out.println(personService);
        personService.addPerson(new Person("Maria",35));
        System.out.println(personService);
        personService.remPerson(3);
        System.out.println(personService.getAllPersons());
        System.out.println(personService.getPersonName("Dan"));
        System.out.println(personService.getOlderPersonThan(30));
        System.out.println(personService.getAllPersonNames());
        System.out.println(personService.getPersonById(4));



    }
}
