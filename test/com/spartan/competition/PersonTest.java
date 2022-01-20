package com.spartan.competition;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = new Person("Vernon", "Stephens", 27, "vern@amazon.com");
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
        assertEquals(27, person.getAge());
    }

    @Test
    public void testGetEmail() {
        assertEquals("vern@amazon.com", person.getEmail());
    }


}