package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {
    private List<T> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {

        return stack.isEmpty();
    }

    public void push(T i) {
        stack.add(i);
    }



    public T pop() throws EmptyStackException {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        Integer lastIndex = stack.size() - 1;
        T removed = stack.get(lastIndex);
        stack.remove(lastIndex);
        return removed;


    }

    public T peek() {
        if (stack.isEmpty()) {
        }
        Integer lastIndex = stack.size() - 1;

        return stack.get(lastIndex);


    }

    public Integer size() {
        return stack.size();
    }
}
