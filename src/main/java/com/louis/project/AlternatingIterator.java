package com.louis.project;

import java.util.Iterator;

public class AlternatingIterator<E> implements Iterator {

    private Iterator<E>[] iterators;

    private int nextIterator = 0;

    public AlternatingIterator(Iterator<E> ... iterators) {
        this.iterators = iterators;
    }

    @Override
    public boolean hasNext() {
        return iterators[nextIterator].hasNext();
    }

    @Override
    public Object next() {
        E element = iterators[nextIterator].next();
        nextIterator = (nextIterator + 1) % iterators.length;
        return element;
    }

}
