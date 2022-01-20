package com.spartan.competition;
import com.spartan.workout.Workout;
import com.spartan.workout.WorkoutCatalog;

import java.util.*;



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

    //ACCESSORS && MUTATORS
    public int getTeamNumber(){return teamNumber;}
    public void setTeamNumber(int teamNumber){this.teamNumber = teamNumber;}

    public List<Person> getMembers(){return members;}
    public void setMembers(List<Person> members){
        this.members = members;}

    public int getTotalPoints() {return totalPoints;}
    public int setTotalPoints() {this.totalPoints = timer();
        return this.totalPoints;
    }



    public Object getWorkoutPlan(){return workoutPlan;}
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
                "teamNumber=" + teamNumber +
                ", members=" + members +
                ", workoutPlan=" + workoutPlan +
                ", totalPoints=" + totalPoints +
                ", speedCompleted=" + speedCompleted +
                '}';
    }

    public static void main(String[] args) {

        Team t1 = new Team();
        Team t2 = new Team();
        Team t3 = new Team();

        Map<Integer, Integer> rounds = new HashMap<>();
        rounds.put(1, t1.setTotalPoints());
        rounds.put(2, t2.setTotalPoints());
        rounds.put(3, t3.setTotalPoints());

        List list=new ArrayList(rounds.entrySet());

        Collections.sort(list,new Comparator(){
            public int compare(Object obj1, Object obj2){
                return ((Comparable)((Map.Entry)(obj1)).getValue

                        ()).compareTo(((Map.Entry)(obj2)).getValue());
            }
        });
        System.out.println(list);

    }

}
