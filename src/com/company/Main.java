package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create an array list of type String
        //when you specify the type like you have below (in the <>'s)you are using Generics
        ArrayList<String> SampleHedges = new ArrayList<String>();

        SampleHedges.add("Please tell me more");
        SampleHedges.add("Many of my patients tell me the same thing");
        SampleHedges.add("It is getting late, maybe we had better quit");

        // a list of sample qualifiers
        ArrayList<String> SampleQualifiers = new ArrayList<String>();

        SampleQualifiers.add("Why do you say that");
        SampleQualifiers.add("You seem to think that");
        SampleQualifiers.add("So, you are concerned that");

        ArrayList<String> SampleQualifierEnds = new ArrayList<String>();

        SampleQualifierEnds.add("?");
        SampleQualifierEnds.add("!");
        SampleQualifierEnds.add(".");

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        Scanner keyboard = new Scanner(System.in);
        String userSentence = keyboard.nextLine();
        System.out.println(SampleQualifiers.get(0)+" " + replace(userSentence)+ SampleQualifierEnds.get(0));


    }

    public static String replace(String userSentence){

        String newSentence = "";
        ArrayList<String> newWords = new ArrayList<String>();
        for (String retval: userSentence.split(" ")) {
            if (retval.equalsIgnoreCase("i")) {
                newWords.add("you");
            }
            else if (retval.equalsIgnoreCase("me")) {
                newWords.add("you");
            }
            else if (retval.equalsIgnoreCase("my")) {
                newWords.add("your");
            }
            else if (retval.equalsIgnoreCase("am")) {
                newWords.add("are");
            }
            else {
            newWords.add(retval);
            }
        }

        for(String word:newWords) {
        newSentence = newSentence + word+ " ";
        }

        return newSentence;
    }
}
