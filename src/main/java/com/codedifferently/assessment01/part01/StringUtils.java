package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        String[] words = sentence.split(" ");
        return words;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        String[] words = getWords(sentence);
        String firstWord = words[0];
        return firstWord;
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        String firstWord = getFirstWord(sentence);
        String reversedFirstWord = BasicStringUtils.reverse(firstWord);
        return reversedFirstWord;
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        String reversedFirstWord = reverseFirstWord(sentence);
        String camelCased = BasicStringUtils.camelCase(reversedFirstWord);
        return camelCased;
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(index);
        return builder.toString();
    }
}
