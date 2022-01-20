package com.spartan.competition;
import com.spartan.workout.Workout;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Team {

    //CONSTANTS
    private static final int MAX_SIZE = 3;

    //INSTANCE VARIABLES
    private int teamNumber;
    private List<Person> members;
    private List<Workout> workoutPlan;
    private int totalPoints;
    private float timeCompleted;

    //IMPLICIT NO-ARGS CTOR (DEFAULT)

    //PRINTS LIST OF ALL ASSIGNED MEMBERS
    public void listMembers(){
        System.out.println("\nTEAM " + this.getTeamNumber() + "'S MEMBERS: ");
        int index = 1;
        for(Person p : members){
            System.out.println(index + ") " + p.getFirstName().toUpperCase() + " " + p.getLastName().toUpperCase());
            index++;
        }
    }

    //RANDOMLY ASSIGNS MAX MEMBERS GIVEN A LIST
    public void assignRandom (List<Person> roster){
        List<Person> newList = new ArrayList<>();
        int randIndex;
        while(newList.size() < MAX_SIZE){
            randIndex = (int) (Math.random() * roster.size());
            if(!newList.contains(roster.get(randIndex))){
                newList.add(roster.get(randIndex));
                roster.remove(randIndex);
            }
        }
        this.setMembers(newList);
    }

    //ACCESSORS && MUTATORS
    public int getTeamNumber(){
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber){
        this.teamNumber = teamNumber;
    }

    public List<Person> getMembers(){
        return members;
    }

    public void setMembers(List<Person> members){
        this.members = members;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public List<Workout> getWorkoutPlan(){
        return workoutPlan;
    }

    //    public static void main(String[] args) {
//
//        //Workout List
//        List<String> workouts = new ArrayList<>();
//        workouts.add("Workout 1");
//        workouts.add("Workout 2");
//        workouts.add("Workout 3");
//        workouts.add("Workout 4");
//        workouts.add("Workout 5");
//        System.out.println("Workout list " + workouts.toString());
//        //Team List
//        List<String> teams = new ArrayList<>();
//        teams.add("Team 1 = Members 1, 2, 3");
//        teams.add("Team 2 = Members 4, 5, 6");
//        teams.add("Team 3 = Members 7, 8, 9");
//        teams.add("Team 4 = Members 10, 11, 12");
//        teams.add("Team 5 = Members 13, 14, 15");
//        System.out.println("Team list " + teams.toString());
//
//        for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }
//    }


//       for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }


    @Override
    public String toString() {
        return  "Team{" +
                "teamNumber=" + this.getTeamNumber() +
                ", members=" + this.getMembers() +
                ", workoutPlan=" + this.getWorkoutPlan() +
                ", totalPoints=" + this.getTotalPoints() +
                '}';
    }
}