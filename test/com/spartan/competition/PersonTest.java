package com.spartan.competition;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;
    @Before
    public void setup(){
        person = new Person("Vernon", "Stephens", 27, "vern@amz.com");
    }

    @Test
    @DisplayName("When instantiated a person has a first name.")
    public void testGetFirstName(){
        assertEquals("Vernon", person.getFirstName());
    }

    @Test
    @DisplayName("When instantiated a person has a last name.")
    public void testGetLastName(){
        assertEquals("Stephens", person.getLastName());
    }

    @Test
    @DisplayName("When instantiated a person has an age.")
    public void testGetAge(){
        assertEquals(27, person.getAge());
    }

    @Test
    @DisplayName("When instantiated a person has a email.")
    public void testGetEmail(){
        assertEquals("vern@amz.com", person.getEmail());
    }
}
