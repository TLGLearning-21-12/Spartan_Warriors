package com.spartan.competition;

import java.util.*;

public class Team {

    //CONSTANTS
    private static final int MAX_SIZE = 3;

    //INSTANCE VARIABLES
    private List<Person> members;
    private Object workoutPlan;
    private int speed;
    private String teamName;

    public Team(String name){
        this.teamName = name;
    }

    //PRINTS LIST OF ALL ASSIGNED MEMBERS
    public void listMembers(){
        System.out.println("\nTEAM " + this.getTeamName().toUpperCase() + "'S MEMBERS: ");
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Person> getMembers(){
        return members;
    }

    public void setMembers(List<Person> members){
        this.members = members;
    }

    public int getSpeed() {
        return speed;
    }

    public int executeWorkout() {
        this.speed = timer();
        return this.speed;
    }

    public Object getWorkoutPlan(){
        return workoutPlan;
    }

    public void setWorkoutPlan(Object catalog){
        this.workoutPlan = catalog;
    }

    public int timer(){
        Random generator = new Random();
        int result = generator.nextInt(100);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName=" + this.getTeamName() +
                ", members=" + this.getMembers() +
                ", workoutPlan=" + this.getWorkoutPlan() +
                ", speed=" + this.getSpeed() +
                '}';
    }

}
