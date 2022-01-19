package com.spartan.workout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Workout {
    private String title;
    private String exercises;

    public Workout(){

    }

    public Workout( String title, String exercises) {
        setTitle(title);
        setExercises(exercises);
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getExercises() {return exercises;}
    public void setExercises(String exercises) {this.exercises = exercises;}


    @Override
    public String toString() {
        return "com.workout.Workout { " +
                "title='" + title + '\'' +
                ", exercises='" + exercises + '\'' +
                '}';
    }
}
