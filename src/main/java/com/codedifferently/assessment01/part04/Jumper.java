package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpCounter = 0;
        int position = 0;
        while (true) {
            if (position + j > k) {
                position++;
                jumpCounter++;
            } else {
                position += j;
                jumpCounter++;
            }
            if (position == k) {
                break;
            }
        }
        return jumpCounter;
    }


}
