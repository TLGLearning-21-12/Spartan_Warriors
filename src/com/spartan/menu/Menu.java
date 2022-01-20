package com.spartan.menu;

import com.spartan.competition.Person;
import com.spartan.competition.Team;

import java.util.*;

public class Menu {
    private static final String SIGN_UP = "Sign Up";
    private static final String VIEW_PARTICIPANTS = "View Participants";
    private static final String START_COMPETITION = "Start Competition";
    private static final String EXIT = "Exit";

    private static final List<String> menuOptions = new ArrayList<>();
    static{
        menuOptions.add(SIGN_UP);
        menuOptions.add(VIEW_PARTICIPANTS);
        menuOptions.add(START_COMPETITION);
        menuOptions.add(EXIT);
    }

  public void teamSignup(){
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter person first name ");
      String fName1 = in.nextLine();
      System.out.println("Please enter person last name");
      String lName1 = in.nextLine();
      System.out.println("Please enter person age");
      int age1 = Integer.parseInt(in.nextLine());
      System.out.println("Please enter persons email address");
      String email1 = in.nextLine();
      Person person1 = new Person(fName1, lName1, age1, email1);

      System.out.println("Please enter person first name ");
      String fName2 = in.nextLine();
      System.out.println("Please enter person last name");
      String lName2 = in.nextLine();
      System.out.println("Please enter person age");
      int age2 = Integer.parseInt(in.nextLine());
      System.out.println("Please enter persons email address");
      String email2 = in.nextLine();
      Person person2 = new Person(fName2, lName2, age2, email2);

      System.out.println("Please enter person first name ");
      String fName3 = in.nextLine();
      System.out.println("Please enter person last name");
      String lName3 = in.nextLine();
      System.out.println("Please enter person age");
      int age3 = Integer.parseInt(in.nextLine());
      System.out.println("Please enter persons email address");
      String email3 = in.nextLine();
      Person person3 = new Person(fName3, lName3, age3, email3);
      Team team1 = new Team(person1, person2, person3);
      System.out.println(team1);
  }

    public static void main(String[] args) {




    }
//        String choice = "";
//        Scanner in = new Scanner(System.in);
////        while(!choice.equalsIgnoreCase(EXIT)){
//            System.out.println("\nWELCOME TO THE NEW SPARTAN WARRIOR COMPETITION!!");
//            System.out.println("****");
//
//            //prints out our options menu & increments the index of each choice
//            int choiceIndex = 1;
//            for(String opt : menuOptions){
//                System.out.println(choiceIndex + ". " + opt);
//                choiceIndex++;
//            }
//
//            //prompts for user to select from the menu
//            System.out.println("****");
//            System.out.println("\nHow can I help you?");
//            in = new Scanner(System.in);
//            int selectedOpt = in.nextInt();
//            choice = menuOptions.get(selectedOpt - 1);
//        if(choice.equalsIgnoreCase(SIGN_UP)){
//
//            //gather user information
//            System.out.println("\nWhat is your first name?");
//            String firstName = in.next();
//
//            System.out.println("\nWhat is your last name?");
//            String lastName = in.next();
//
//            System.out.println("\nWhat is your email?");
//            String email = in.next();
//
//            System.out.println("\nHow old are you?");
//            int age = in.nextInt();
//
//            System.out.println("\nWhat team do you want to join?");
//            int team = in.nextInt();
//
////            if(validateAge(age, choice)) {
////                System.out.println("\nIs all your information correct?");
////                String confirm = in.next();
////                if(confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")){
////                    signUp(firstName,lastName,age,email, participants);
////                } else{
////                    choice = "";
////                }
////            }
//
//        } else if(choice.equalsIgnoreCase(VIEW_PARTICIPANTS)){
//            System.out.println("Test from View Participants");
////            if(participants.isEmpty()){
////                System.out.println("Participant roster is empty.");
////            } else{
////                listRoster(participants);
//        }else if(choice.equalsIgnoreCase(START_COMPETITION)){
////            System.out.println("\nASSIGNING TEAMS...");
////            List<Person> members = new ArrayList<>();
////
////            while(members.isEmpty() && !participants.isEmpty()){
////                members = assignRandom(participants);
////            }
////
////            System.out.println("Team members are:");
////            int index = 1;
////            for( Person p : members){
////                System.out.println(index + "." + p.getFirstName().toUpperCase() + " " + p.getLastName().toUpperCase());
////                index++;
////            }
//
//        }
//        }
        }




