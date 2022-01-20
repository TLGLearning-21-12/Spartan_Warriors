package com.spartan.competition;

import java.util.*;

public class CompetitionDriver {

    private static final int MAX_PARTICIPANTS = 9;

    //menu options
    private static final String SIGN_UP = "Sign Up";
    private static final String VIEW_PARTICIPANTS = "View Participants";
    private static final String START_COMPETITION = "Start Competition";
    private static final String EXIT = "Exit";

    private static Scanner scanner;

    public static void main(String[] args) {

        //List of Teams
        List<Team> teams = new ArrayList<>();
        teams.add(new Team());
        teams.add(new Team());
        teams.add(new Team());
        
        //participant roster
        List<Person> participants = new ArrayList<>();
        participants.add(new Person("Vernon", "Stephens", 26, "vern@amz.com"));
        participants.add(new Person("Sterling", "Meriweather", 27, "meri@amz.com"));
        participants.add(new Person("Izzy", "Servin", 29, "izzy@amz.com"));
        participants.add(new Person("Tim", "Olowookere", 28, "tim@amz.com"));
        participants.add(new Person("Maria", "Nieves", 27, "maria@amz.com"));
        participants.add(new Person("Zane", "Zeulner", 29, "josh@amz.com"));
        participants.add(new Person("Sarah", "Lichy", 28, "sarah@amz.com"));
        participants.add(new Person("Luxi", "Meng", 27, "maria@amz.com"));

        //list of our options menu
        List<String> options = new ArrayList<>();
        options.add(SIGN_UP);
        options.add(VIEW_PARTICIPANTS);
        options.add(START_COMPETITION);
        options.add(EXIT);

        String choice = "";
        while(!choice.equalsIgnoreCase(EXIT)) {
            System.out.println("\nWELCOME TO THE NEW SPARTAN WARRIOR COMPETITION!!");
            System.out.println("****");

            //prints out our options menu & increments the index of each choice
            int choiceIndex = 1;
            for(String opt : options){
                System.out.println(choiceIndex + ". " + opt);
                choiceIndex++;
            }

            //prompts for user to select from the menu
            System.out.println("****");
            System.out.println("\nHow can I help you?");
            scanner = new Scanner(System.in);

            //store the selection in this variable and reassign the users choice to the appropriate k/v pair
            int selectedOpt = scanner.nextInt();
            choice = options.get(selectedOpt - 1);

            if(choice.equalsIgnoreCase(SIGN_UP)){
                if(participants.size() < MAX_PARTICIPANTS){

                    //collect user information
                    System.out.println("\nWhat is your first name?");
                    String firstName = scanner.next();

                    System.out.println("\nWhat is your last name?");
                    String lastName = scanner.next();

                    System.out.println("\nWhat is your email?");
                    String email = scanner.next();

                    System.out.println("\nHow old are you?");
                    int age = scanner.nextInt();

                    //if age is valid allow person to sign up
                    if(validAge(age)) {
                        System.out.println("\nIs all your information correct?");
                        String confirm = scanner.next();
                        if(confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")){
                            signUp(firstName,lastName,age,email, participants);
                        }
                    }

                    //if not then call the next person in line
                } else {
                    System.out.println("Sorry we have reached the max capacity of participants for today's competition.");
                }

            //list current participant roster
            } else if (choice.equalsIgnoreCase(VIEW_PARTICIPANTS)){
                if(participants.isEmpty()){
                    System.out.println("Participant roster is empty.");
                } else{
                    listRoster(participants);
                }

             //if we have the expected number of partcipants then we can start the competition
            } else if (choice.equalsIgnoreCase(START_COMPETITION)){
                if(participants.size() == MAX_PARTICIPANTS){

                    //assign teams randomly
                    System.out.println("\nASSIGNING TEAMS...");
                    int teamNumber = 1;
                    for(Team team : teams){
                        team.assignRandom(participants);
                        team.setTeamNumber(teamNumber++);
                        team.listMembers();
                    }

                 //if we dont have enough people then we cannot start the comp
                } else{
                    System.out.println("Sorry we are still waiting on more people to sign up before starting the competition.");
                }
            }
        }
    }

    public static void signUp(String first, String last, int age, String email, List<Person> roster){
        Person p1 = new Person(first, last, age, email);
        roster.add(p1);
        System.out.println("YOU HAVE BEEN SUCCESSFULLY ADDED TO THE PARTICIPANTS ROSTER!");
    }

    public static boolean validAge(int age){
        boolean validAge;
        if (age >= 18 ){
            validAge = true;
        } else{
            System.out.println("Sorry you must be 18 or older to sign up for Spartan Warriors. \nNext person please.");
            validAge = false;
        }
        return validAge;
    }

    public static void listRoster(List<Person> participants){
        int index = 1;
        System.out.println("\n****\nOur current participants roster is: ");
        for(Person p : participants){
            System.out.println(index + ". " + p.getFirstName().toUpperCase() + " " + p.getLastName().toUpperCase());
            index++;
        }
    }
}
