package com.spartan.workout.competition.client;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Team {
    public static void main(String[] args) {

        //Workout List
        List<String> workouts = new ArrayList<>();
        workouts.add("Workout 1");
        workouts.add("Workout 2");
        workouts.add("Workout 3");
        workouts.add("Workout 4");
        workouts.add("Workout 5");
        System.out.println("Workout list " + workouts.toString());
        //Team List
        List<String> teams = new ArrayList<>();
        teams.add("Team 1 = Members 1, 2, 3");
        teams.add("Team 2 = Members 4, 5, 6");
        teams.add("Team 3 = Members 7, 8, 9");
        teams.add("Team 4 = Members 10, 11, 12");
        teams.add("Team 5 = Members 13, 14, 15");
        System.out.println("Team list " + teams.toString());

        for (int i = 0; i < teams.size(); i++) {
           int index = (int) (Math.random() * teams.size());
           System.out.println(" Random Element is :" + teams.get(index));
       }
    }

}

//       for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }