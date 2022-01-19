package com.spartan.competition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionDriver {

    //menu options
    private static final String SIGN_UP = "Sign Up";
    private static final String VIEW_PARTICIPANTS = "View Participants";
    private static final String START_COMPETITION = "Start Competition";
    private static final String EXIT = "Exit";

//    private static final int MAX_PARTICIPANTS = 3;

    private static Scanner scanner;


    public static void main(String[] args) {

        //participant roster
        List<Person> participants = new ArrayList<>();
        participants.add(new Person("Vernon", "Stephens", 26, "vern@amz.com"));
        participants.add(new Person("Sterling", "Meriweather", 27, "meri@amz.com"));
        participants.add(new Person("Izzy", "Servin", 27, "izzy@amz.com"));
        participants.add(new Person("Tim", "O", 27, "tim@amz.com"));
        participants.add(new Person("Maria", "Nieves", 27, "maria@amz.com"));


        //list of our options menu
        List<String> options = new ArrayList<>();
        options.add(SIGN_UP);
        options.add(VIEW_PARTICIPANTS);
        options.add(EXIT);
        options.add(START_COMPETITION);


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

                //gather user information
                System.out.println("\nWhat is your first name?");
                String firstName = scanner.next();

                System.out.println("\nWhat is your last name?");
                String lastName = scanner.next();

                System.out.println("\nWhat is your email?");
                String email = scanner.next();

                System.out.println("\nHow old are you?");
                int age = scanner.nextInt();

                if(validateAge(age, choice)) {
                    System.out.println("\nIs all your information correct?");
                    String confirm = scanner.next();
                    if(confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")){
                        signUp(firstName,lastName,age,email, participants);
                    } else{
                        choice = "";
                    }
                }

            } else if(choice.equalsIgnoreCase(VIEW_PARTICIPANTS)){
                if(participants.isEmpty()){
                    System.out.println("Participant roster is empty.");
                } else{
                    listRoster(participants);
                }

            } else if(choice.equalsIgnoreCase(START_COMPETITION)){
                System.out.println("\nASSIGNING TEAMS...");
                List<Person> members = new ArrayList<>();

                while(members.isEmpty() && !participants.isEmpty()){
                    members = assignRandom(participants);
                }

                System.out.println("Team members are:");
                int index = 1;
                for( Person p : members){
                    System.out.println(index + "." + p.getFirstName().toUpperCase() + " " + p.getLastName().toUpperCase());
                    index++;
                }
            }
        }
    }

    public static void signUp(String first, String last, int age, String email, List<Person> roster){
        Person p1 = new Person(first, last, age, email);
        roster.add(p1);
        System.out.println("YOU HAVE BEEN SUCCESSFULLY ADDED TO THE PARTICIPANTS ROSTER!");
    }

    public static boolean validateAge(int age, String choice){
        boolean validAge;
        if (age >= 18 ){
            validAge = true;
        } else{
            System.out.println("Sorry you must be 18 or older to sign up for Spartan Warriors. \nNext person please.");
            validAge = false;
            choice = EXIT;
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

    public static List<Person> assignRandom (List<Person> roster){
        List<Person> newList = new ArrayList<>();
        int randIndex;

        while(!roster.isEmpty()){
            randIndex = (int) (Math.random() * roster.size());
            newList.add(roster.get(randIndex));
            roster.remove(randIndex);
        }
        return newList;
    }
}
