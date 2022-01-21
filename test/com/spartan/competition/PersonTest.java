package com.spartan.competition;

import com.spartan.competition.exceptions.InvalidAgeException;
import com.spartan.competition.exceptions.InvalidEmailException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws InvalidAgeException, InvalidEmailException {
    person = new Person("Vernon", "Stephens", 26, "vern@amz.com");
    }

    @Test
    public void testGetFirstName() {
        assertEquals("Vernon", person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Stephens", person.getLastName());
    }

    @Test
    public void testGetAge() {
        assertEquals(26, person.getAge());
    }

    @Test
    public void testGetEmail() {
        assertEquals("vern@amz.com", person.getEmail());
    }

}