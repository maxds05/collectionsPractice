package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myNumbers.add(i);
        }

        Collections.shuffle(myNumbers);
        myNumbers.add(5, 22);

        System.out.println(myNumbers);

    }
}
