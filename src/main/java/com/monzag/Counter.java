package com.monzag;

import java.util.ArrayList;

public class Counter<T> {

//    k - counter

    public T countWinner(ArrayList<T> players, Integer k) {
        int indexToRemove = 0;
        while (players.size() > 1) {
            indexToRemove = (indexToRemove + k - 1) % players.size();
            players.remove(indexToRemove);
        }

        return players.get(0);
    }
}
