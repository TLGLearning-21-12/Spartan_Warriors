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

    //print workoutPlan that was randomly assigned
    public void showWorkoutPlan(){
        System.out.println(this.getWorkoutPlan());
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
