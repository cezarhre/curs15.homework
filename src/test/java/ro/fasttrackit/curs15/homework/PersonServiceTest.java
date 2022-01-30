package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class PersonServiceTest {
    @Test
    @DisplayName("WHEN person added is null THEN return persons list")
    void testAddPersonNull(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person("Costel",35),
                new Person("Dan",45)));
        //RUN
        personService.addPerson(new Person("Maria",35));
        //ASSERT
        assertThat(personService).isNotNull();
    }

    @Test
    @DisplayName("WHEN Id did not exist THEN throw exception")
    void testRemPersonId(){
        //SETUP
      PersonService personService = new PersonService(List.of(
                new Person("Costel",35),
                new Person("Dan",45)));
       //RUN
       //ASSERT
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()->personService.remPerson(10));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Not a valid Id");
    }

    @Test
    @DisplayName("WHEN persons are null THEN return empty list")
    void testAllPersonsNull(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person("Costel",35),
                new Person("Dan",45)));
        //RUN
        List<Person> actual = personService.getAllPersons();
        //ASSERT
        assertThat(actual).isNotNull();
        assertThat(actual).isEmpty();
    }

    @Test
    @DisplayName("WHEN age is invalid THEN not a valid age")
    void testValidAge(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person("Ionel", -1),
                new Person("George", 130)));
        //RUN
        //ASSERT
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()->personService.getOlderPersonThan(-1));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Not a valid age");
    }

    @Test
    @DisplayName("WHEN the name is null THEN throw exception")
    void testNameNull(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person(null, 20),
                new Person(null, 30)));
        //RUN
        //ASSERT
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()->personService.getPersonName(null));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Not a valid name");
    }

}
