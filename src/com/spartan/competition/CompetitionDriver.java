package com.spartan.competition;
import java.util.Scanner;

public class CompetitionDriver {

    public static void main(String[] args) {
        
        System.out.println("WELCOME TO THE NEW SPARTAN WARRIOR COMPETITON!!");

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter person first name ");
        String fName = in.nextLine();
        System.out.println("Please enter person last name");
        String lName = in.nextLine();
        System.out.println("Please enter person age");
        int age = Integer.parseInt(in.nextLine());
        System.out.println("Please enter persons email address");
        String email = in.nextLine();

        Person person = new Person(fName, lName, age, email);
        System.out.println(person);

    }
}
