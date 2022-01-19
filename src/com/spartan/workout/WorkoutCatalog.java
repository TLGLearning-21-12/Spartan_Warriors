package com.spartan.workout;

import java.util.*;

public class WorkoutCatalog {

    private static final HashMap<Integer, Workout> workoutMap = new HashMap<>();
    static {
        workoutMap.put(1, new Workout("Murph","1 mile run, 100 pull ups, 200 push ups, 300 Air Squats, 1 mile run" ));
        workoutMap.put(2, new Workout("Sally", "20 sit ups, 30 air squats, .5 mile run"));
        workoutMap.put(3, new Workout("Sue", "50 barbell squats at 50% of body weight"));
        workoutMap.put(4, new Workout("Angie", " 100 Pull-ups | 100 Push-ups | 100 Sit-Ups | 100 Sqauts "));
        workoutMap.put(5, new Workout("Barbara", " 20 Pull-ups | 30 Push-ups | 40 Sit-ups | 50 Squats"));
        workoutMap.put(6, new Workout("Chelsea", " EMOM for 30 miutes: 5 Pull-ups | 10 Push-ups | 15 Squats "));
        workoutMap.put(7, new Workout("Grace", " 30 reps for time: Clean and Jerk 135lbs "));
        workoutMap.put(8, new Workout("Helen", " 3 rounds for time: 400 meter run | 21 Kettlebell swings | 12 Pull-ups"));
        workoutMap.put(9, new Workout("Isabel", " 30 reps for time: Snatch 135lbs"));
        workoutMap.put(10, new Workout("Nancy", " 5 rounds for time: 400 meter run | 15 overhead squats at 30% body weight"));
        workoutMap.put(11, new Workout("Hansen", " 5 rounds for time: 30 kettlebell swings | 30 burpees | 30 Sit-ups"));
        workoutMap.put(12, new Workout("Bobbie", " 100 Turkish get ups"));
        workoutMap.put(13, new Workout("Karl", " Fireman carry 400 meters"));
        workoutMap.put(14, new Workout("Bert", " 1000 Jumping jacks"));
        workoutMap.put(15, new Workout("Meri", "Run 10 Meters"));
    }

    public Object randomWorkout() {
        Random generator = new Random();
        Object[] values = workoutMap.values().toArray();
        Object randomValue = values[generator.nextInt(values.length)];
        return randomValue;
    }


}
