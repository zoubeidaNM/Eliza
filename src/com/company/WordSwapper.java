package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class WordSwapper {

    String sentence;

    public WordSwapper() {
        sentence = "";
    }

    public WordSwapper(String tosentence) {
        sentence = tosentence;
    }

    public String swapWords(String str) {
        String newStr = "";

        // initialize the words in the HashMap myMap
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("I", "you");
        myMap.put("i", "you");
        myMap.put("me", "you");
        myMap.put("am", "are");
        myMap.put("my", "your");
        myMap.put("you", "I");
        myMap.put("are", "am");
        myMap.put("your", "my");
        myMap.put("Me", "you");
        myMap.put("Am", "are");
        myMap.put("My", "your");
        myMap.put("You", "I");
        myMap.put("Are", "am");
        myMap.put("Your", "my");
        myMap.put("ME", "you");
        myMap.put("AM", "are");
        myMap.put("MY", "your");
        myMap.put("YOU", "I");
        myMap.put("ARE", "am");
        myMap.put("YOUR", "my");

        // swap the key words in the sentence.
        ArrayList<String> newWords = new ArrayList<String>();

        for (String retval : str.split(" ")) {
            if (myMap.containsKey(retval)) {
                newWords.add(myMap.get(retval));
            } else {
                newWords.add(retval);
            }
        }

        for (String word : newWords) {
            newStr += (word + " ");
        }


        return newStr;
    }
}
