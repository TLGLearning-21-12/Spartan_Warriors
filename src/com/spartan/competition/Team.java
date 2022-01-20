package com.spartan.competition;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Team {
    private List<Person>team;

    public static void main(String[] args) {


        //Team List
        List<String> teams = new ArrayList<>();
        teams.add("Team 1");
        teams.add("Team 2");
        teams.add("Team 3");
        teams.add("Team 4");
        teams.add("Team 5");
        //System.out.println("Team list " + teams.toString());
        //Workout List
        List<String> workouts = new ArrayList<>();
        workouts.add("Workout 1");
        workouts.add("Workout 2");
        workouts.add("Workout 3");
        workouts.add("Workout 4");
        workouts.add("Workout 5");
        //System.out.println("Workout list " + workouts.toString());
        //Members List
        List<String> members = new ArrayList<>();
        members.add("Members 1, 2, 3");
        members.add("Members 4, 5, 6");
        members.add("Members 7, 8, 9");
        members.add("Members 10, 11, 12");
        members.add("Members 13, 14, 15");

        Random numberGenerator = new Random();
        int nextRandom = numberGenerator.nextInt(5);
        Set<Integer> validate = new HashSet<>();
        validate.add(nextRandom);
        for (int i = 0; i < 5; i++) {
            while(validate.contains(nextRandom)) {
                nextRandom = numberGenerator.nextInt(5);
            }
            validate.add(nextRandom);
            System.out.println(teams.get(nextRandom));
            System.out.println(workouts.get(nextRandom));
            System.out.println(members.get(nextRandom));
        }
    }

}

        //for (int i = 0; i < teams.size(); i++) {
        //int index = (int) (Math.random() * teams.size());
        //System.out.println(" Random Element is :" + teams.get(index));

//       for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }