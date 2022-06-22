package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        boolean shouldConvertNextCharToLower = true;
        StringBuilder builder =new StringBuilder();
        char delimiter = ' ';
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == delimiter) {
                shouldConvertNextCharToLower = false;
            } else if (shouldConvertNextCharToLower|| currentChar == str.charAt(0)) {
                builder.append(Character.toLowerCase(currentChar));
            } else {
                builder.append(Character.toUpperCase(currentChar));
                shouldConvertNextCharToLower = true;
            }
        }
        char first = Character.toUpperCase(builder.charAt(0));
        builder.replace(0,1, String.valueOf(first));
        return builder.toString();
        }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String reversed = reverse(str);
        String camelCased = camelCase(reversed);
       return camelCased;
    }

    public static String removeFirstAndLastCharacter(String str){
        Integer firstIndex = 0;
        Integer lastIndex = str.length()-2;
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.deleteCharAt(firstIndex);
        builder.deleteCharAt(lastIndex);
        return builder.toString();
    }


}
