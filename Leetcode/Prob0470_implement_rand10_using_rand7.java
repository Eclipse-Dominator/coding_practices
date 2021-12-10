package Leetcode;

import java.util.Random;

public class Prob0470_implement_rand10_using_rand7 {
    public int rand10() { // implemented using rejection sampling
        int guess = 0;
        do {
            guess = (rand7() - 1) * 7 + rand7();
        } while (guess > 40);
        return guess % 10;
    }

    private int rand7() {
        return new Random().nextInt(6) + 1;
    }
}
