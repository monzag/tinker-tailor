package com.monzag;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    
    private ArrayList<Integer> generateList(Integer n) {
        ArrayList<Integer> players = new ArrayList<>();
        for (Integer i = 1; i < n ; i++) {
            players.add(i);
        }

        return players;
    }

}