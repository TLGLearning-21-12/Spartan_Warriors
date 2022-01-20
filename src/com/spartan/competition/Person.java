package com.spartan.competition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

        private static final int MIN_AGE = 18;
        private static final int MAX_AGE = 80;


        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public Person(){

        }

        public Person(String firstName, String lastName, int age, String email) throws InvalidEmailException, InvalidAgeException {
            this.firstName = firstName;
            this.lastName = lastName;
            setAge(age);
            setEmail(email);
        }

        public void setEmail(String email) throws InvalidEmailException{
            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()) {
                this.email = email;
            } else {
                throw new InvalidEmailException("Invalid email provided.");
            }
        }

        public boolean setAge(int age) throws InvalidAgeException{
            boolean validAge;
            if (age >= MIN_AGE && age <= MAX_AGE ){
                validAge = true;
                this.age = age;
            } else{
                throw new InvalidAgeException("Must be at least " + MIN_AGE
                        + " and younger than " + MAX_AGE
                        + "to participate in SPARTAN WARRIORS");
            }
            return validAge;
        }


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", email='" + email + '\'' + '}';
        }
    }

