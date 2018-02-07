package com.monzag;

import java.util.ArrayList;

public class Counter<T> {

    private static final int FIRST_INDEX = 0;
    private static final int ONE_ELEMENT_LIST = 1;
    private static final int INDEX_CORRECTION = 1;

//    k - counter
    public T countWinner(ArrayList<T> players, Integer k) throws IndexOutOfBoundsException {
        int indexToRemove = FIRST_INDEX;
        while (players.size() > ONE_ELEMENT_LIST) {
            indexToRemove = (indexToRemove + k - INDEX_CORRECTION) % players.size();
            players.remove(indexToRemove);
        }

        return players.get(FIRST_INDEX);
    }
}
