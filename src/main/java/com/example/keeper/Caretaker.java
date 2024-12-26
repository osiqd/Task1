package com.example.keeper;

import java.util.ArrayDeque;
import java.util.Queue;

public class Caretaker {
    private Queue<Memento> mementoList = new ArrayDeque<>();

    // Сохраняем состояние
    public void push(Memento state) {
        mementoList.add(state);
    }
}
