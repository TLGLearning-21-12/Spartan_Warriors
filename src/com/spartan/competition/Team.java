package com.spartan.competition;

import java.util.ArrayList;
import java.util.List;

public class Team {

    //CONSTANTS
    private static final int MAX_SIZE = 3;

    //INSTANCE VARIABLES
    private int teamNumber;
    private List<Person> members;
    private Object workoutPlan;
    private int totalPoints;
    private int speedCompleted;

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

    //print workoutPlan that was randomly assigned
    public void showWorkoutPlan(){
        System.out.println("Team");
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

    public Object getWorkoutPlan(){
        return workoutPlan;
    }

    public void setWorkoutPlan(Object catalog){
        this.workoutPlan = catalog;
    }


//    public static void main(String[] args) {
//
//
//        //Team List
//        List<String> teams = new ArrayList<>();      //CAN TRACK A LIST OF PERSON OBJECTS AS AN INSTANCE VARIABLE IN TEAM
//        teams.add("Team 1");
//        teams.add("Team 2");
//        teams.add("Team 3");
//        teams.add("Team 4");
//        teams.add("Team 5");
//        //System.out.println("Team list " + teams.toString());

//        //Workout List
//        List<String> workouts = new ArrayList<>();
//        workouts.add("Workout 1");
//        workouts.add("Workout 2");
//        workouts.add("Workout 3");
//        workouts.add("Workout 4");
//        workouts.add("Workout 5");
//        //System.out.println("Workout list " + workouts.toString());

//        //Members List
//        List<String> members = new ArrayList<>();
//        members.add("Members 1, 2, 3");
//        members.add("Members 4, 5, 6");
//        members.add("Members 7, 8, 9");
//        members.add("Members 10, 11, 12");
//        members.add("Members 13, 14, 15");
//
//        Random numberGenerator = new Random();        // CAN BE EXTRACTED OUT TO ITS OWN METHOD IN TEAM AS A CUSTOM BUSINESS METHOD
//        int nextRandom = numberGenerator.nextInt(5);
//        Set<Integer> validate = new HashSet<>();
//        validate.add(nextRandom);
//        for (int i = 0; i < 5; i++) {
//            while(validate.contains(nextRandom)) {
//                nextRandom = numberGenerator.nextInt(5);
//            }
//            validate.add(nextRandom);
//            System.out.println(teams.get(nextRandom));
//            System.out.println(workouts.get(nextRandom));
//            System.out.println(members.get(nextRandom));
//        }
//    }

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

        //for (int i = 0; i < teams.size(); i++) {
        //int index = (int) (Math.random() * teams.size());
        //System.out.println(" Random Element is :" + teams.get(index));

//       for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }