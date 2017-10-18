package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create an Eliza object
        Therapist Eliza = new Therapist();

        //add the sample hedges to Eliza

        Eliza.addSampleHedge("Please tell me more.");
        Eliza.addSampleHedge("Many of my patients tell me the same thing.");
        Eliza.addSampleHedge("Are you sure?");
        Eliza.addSampleHedge("It is getting late, maybe we had better quit.");
        Eliza.addSampleHedge("That is what happens some times in life.");
        Eliza.addSampleHedge("How does that make you feel?");
        Eliza.addSampleHedge("Can we dialogue about this??");
        Eliza.addSampleHedge("Let's bring it back into the room.");
        Eliza.addSampleHedge("And how's that working for you?");
        Eliza.addSampleHedge("Let's get in touch with your inner child.");
        Eliza.addSampleHedge("Apply your oxygen mask first.");
        Eliza.addSampleHedge("Time will tell.");
        Eliza.addSampleHedge("You can't make an omelet without breaking eggs");

        // add sample qualifiers to Eliza

        Eliza.addSampleQualifier("Why do you say that");
        Eliza.addSampleQualifier("You seem to think that");
        Eliza.addSampleQualifier("So, you are concerned that");
        Eliza.addSampleQualifier("Are you sure that");
        Eliza.addSampleQualifier("If I heard correctly, ");
        Eliza.addSampleQualifier("Did you say: ");

        // add sample qualifiers end of sentence

        Eliza.addSampleQualifierEnd("?");
        Eliza.addSampleQualifierEnd("!");
        Eliza.addSampleQualifierEnd(".");
        Eliza.addSampleQualifierEnd("?");
        Eliza.addSampleQualifierEnd(".");
        Eliza.addSampleQualifierEnd("?");

        // greeting from Eliza
        System.out.println(Eliza.getGreeting());

        Scanner keyboard = new Scanner(System.in);
        String userSentence = "";
        Random generator = new Random();

        do {

            userSentence = keyboard.nextLine();

            // key word swapper class
            WordSwapper ws = new WordSwapper();


            if (!userSentence.equalsIgnoreCase("q")) {

                // random generator to see if the answer will be a sample hedge or a replacement sentence
                int SentenceToUse = generator.nextInt(4);
                if (SentenceToUse == 0) {

                    //answer with a random sample hedge
                    int sampleHedgeIndex = generator.nextInt(Eliza.getSampleHedges().size());
                    System.out.println(Eliza.getSampleHedges().get(sampleHedgeIndex));
                } else {
                    //start the sentence with a random Qualifiers and swap the key words
                    int sampleQualifiersIndex = generator.nextInt(Eliza.getSampleQualifiers().size());
                    System.out.println(Eliza.getSampleQualifiers().get(sampleQualifiersIndex) + " " + ws.swapWords(userSentence) +
                            Eliza.getSampleQualifiersEnds().get(sampleQualifiersIndex));

                }
            }
        } while (!userSentence.equalsIgnoreCase("q"));


    }


}
