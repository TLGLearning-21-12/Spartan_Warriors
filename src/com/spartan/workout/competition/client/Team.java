package com.spartan.workout.competition.client;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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

        List<String> members = new ArrayList<>();
        members.add("Member 1");
        members.add("Member 2");
        members.add("Member 3");
        members.add("Member 4");
        members.add("Member 5");
        members.add("Member 6");
        members.add("Member 7");
        members.add("Member 8");
        members.add("Member 9");
        members.add("Member 10");
        members.add("Member 11");
        members.add("Member 12");
        members.add("Member 13");
        members.add("Member 14");
        members.add("Member 15");
        System.out.println("Member list " + members.toString());

        List<Integer> teams = new ArrayList<>();
        teams.add(1);
        teams.add(2);
        teams.add(3);
        System.out.println("Team " + teams.toString());
    }
}
