package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PersonTest {

    @Test
    @DisplayName("WHEN name is null THEN throw exception")
    void testNotNullName() {
        //SETUP
        Person person = new Person( null, 25);
        //RUN
        String name = person.getName();
        //ASSERT
        assertThat(name).isEqualTo("Not a valid name");
    }

    @Test
    @DisplayName("When age is invalid THEN throw exception")
    void testInvalidAge() {
        //SETUP
        Person person = new Person("Maria",130);
        //RUN
        //ASSERT
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, person::getAge);
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Not a valid age");
    }
}

