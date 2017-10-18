package com.company;

import java.util.ArrayList;

public class Therapist {

    private String greetings;
    private ArrayList<String> sampleHedges;
    private ArrayList<String> sampleQualifiers;
    private ArrayList<String> sampleQualifierEnds;


    public Therapist() {
        greetings = "Hello! My name is Eliza. I am your therapist.\n" +
                "What is your problem? Enter your response here or press Q to quit:";

        // initialize lists
        sampleHedges = new ArrayList<String>();
        sampleQualifiers = new ArrayList<String>();
        sampleQualifierEnds = new ArrayList<String>();
    }

    public Therapist(String togreetings) {
        greetings = togreetings;
    }

    public String getGreeting() {
        return greetings;
    }

    public void setGreetings(String togreetings) {
        greetings = togreetings;
    }

    // sample hedges
    public ArrayList getSampleHedges() {
        return sampleHedges;
    }

    public void setSampleHedges(ArrayList tosampleHedges) {
        sampleHedges = tosampleHedges;
    }

    //sample qualifiers
    public ArrayList getSampleQualifiers() {
        return sampleQualifiers;
    }

    public void setSampleQualifiers(ArrayList tosampleQualifiers) {
        sampleQualifiers = tosampleQualifiers;
    }

    // sample qualifier ends
    public ArrayList getSampleQualifiersEnds() {
        return sampleQualifierEnds;
    }

    public void setSampleQualifiersEnds(ArrayList tosampleQualifierEnds) {
        sampleQualifierEnds = tosampleQualifierEnds;
    }

    // add a simple hedge
    public void addSampleHedge(String SampleHedge) {
        sampleHedges.add(SampleHedge);
    }

    // remove a simple hedge
    public void removeSampleHedge(int index) {
        sampleHedges.remove(index);
    }

    // add a simple qualifier
    public void addSampleQualifier(String sampleQualifier) {
        sampleQualifiers.add(sampleQualifier);
    }

    //remove a simple qualifier
    public void removeSampleQualifier(int index) {
        sampleQualifiers.remove(index);
    }

    // add a simple qualifier end of sentence
    public void addSampleQualifierEnd(String sampleQualifierEnd) {
        sampleQualifierEnds.add(sampleQualifierEnd);
    }

    // remove a simple qualifier end of sentence
    public void removeSampleQualifierEnd(int index) {
        sampleQualifierEnds.remove(index);
    }


}
