package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private Counter<Integer> counter;

    @BeforeEach
    void setup() {
        counter = new Counter<>();
    }

    @Test
    void testCounter() {
        Integer expect = 4;
        assertEquals(expect, counter.countWinner(generateList(6), 3));
    }

    @Test
    void testCounter2() {
        Integer expect = 1;
        assertEquals(expect, counter.countWinner(generateList(6), 50));
    }

    private ArrayList<Integer> generateList(Integer n) {
        ArrayList<Integer> players = new ArrayList<>();
        for (Integer i = 1; i < n ; i++) {
            players.add(i);
        }

        return players;
    }

}