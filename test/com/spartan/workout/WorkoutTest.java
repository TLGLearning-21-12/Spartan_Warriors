package com.spartan.workout;

import com.spartan.competition.InvalidAgeException;
import com.spartan.competition.InvalidEmailException;
import com.spartan.competition.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkoutTest {

    private Workout workout;

    @Before
    public void setUp() {
        workout = new Workout("Sally", "20 sit ups, 30 air squats, .5 mile run");
    }

    @Test
    public void getTitle() {
        assertEquals("Sally", workout.getTitle());
    }

    @Test
    public void getExercises() {
        assertEquals("20 sit ups, 30 air squats, .5 mile run", workout.getExercises());
    }
}