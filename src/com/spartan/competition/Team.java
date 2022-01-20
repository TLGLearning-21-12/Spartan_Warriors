package com.spartan.competition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class Team {
    private Person p1;
    private Person p2;
    private Person p3;

    public Team (Person p1){
        this.p1 = p1;
    }

    public Team (Person p1, Person p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Team(Person p1, Person p2, Person p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Person getP1() {return p1;}
    public void setP1(Person p1) {this.p1 = p1;}

    public Person getP2() {return p2;}
    public void setP2(Person p2) {this.p2 = p2;}

    public Person getP3() {return p3;}
    public void setP3(Person p3) {this.p3 = p3;}

    public List<Person> team = new ArrayList();

    public void setTeam(Person p){
        if(team.isEmpty()){
            team = new ArrayList<>();
        }
        team.add(p);
    }

    public void printTeam(){
        if(!team.isEmpty()){
            for(Person p : team){
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {

    }


    @Override
    public String toString() {
        return "Team{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
//    private List<Person>team;
//
//    public static void main(String[] args) {
//
//
//
//        //Team List
//        List<String> teams = new ArrayList<>();
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
//        Random numberGenerator = new Random();
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




        //for (int i = 0; i < teams.size(); i++) {
        //int index = (int) (Math.random() * teams.size());
        //System.out.println(" Random Element is :" + teams.get(index));

//       for (int i = 0; i < teams.size(); i++) {
//           int index = (int) (Math.random() * teams.size());
//           System.out.println(" Random Element is :" + teams.get(index));
//       }