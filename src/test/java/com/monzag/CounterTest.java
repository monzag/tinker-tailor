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

    @Test
    void testCounter3() {
        Integer expect = 5;
        assertEquals(expect, counter.countWinner(generateList(6), 1));
    }

    @Test
    void testCounterForEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> counter.countWinner(emptyList, 1));
    }

    @Test
    void testCounterForZero() {
        assertThrows(IndexOutOfBoundsException.class, () -> counter.countWinner(generateList(6), 0));
    }

    private ArrayList<Integer> generateList(Integer n) {
        ArrayList<Integer> players = new ArrayList<>();
        for (Integer i = 1; i < n ; i++) {
            players.add(i);
        }

        return players;
    }

}