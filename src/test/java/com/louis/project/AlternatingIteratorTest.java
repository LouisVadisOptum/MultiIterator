package com.louis.project;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AlternatingIteratorTest {

    @Test
    public void testAlternatingIterator(){
        ArrayList stringArrayList = new ArrayList();
        stringArrayList.add("c");
        stringArrayList.add("c1");
        stringArrayList.add("c2");
        stringArrayList.add("c3");


        ArrayList integerArrayList = new ArrayList();
        integerArrayList.add("1");
        integerArrayList.add("2");
        integerArrayList.add("3");
        integerArrayList.add("4");


        AlternatingIterator alternatingIterator = new AlternatingIterator(stringArrayList.iterator(),integerArrayList.iterator());
        StringBuilder builder = new StringBuilder();

        while(alternatingIterator.hasNext()){
            builder.append(alternatingIterator.next());
        }

        assert(builder.toString().equals("c1c12c23c34"));
    }

    @Test
    public void testThreeIterables(){
        ArrayList stringArrayList = new ArrayList();
        stringArrayList.add("c");
        stringArrayList.add("c1");
        stringArrayList.add("c2");
        stringArrayList.add("c3");


        ArrayList integerArrayList = new ArrayList();
        integerArrayList.add("x");
        integerArrayList.add("y");
        integerArrayList.add("z");
        integerArrayList.add("w");

        ArrayList integerArrayList2 = new ArrayList();
        integerArrayList2.add(1);
        integerArrayList2.add(2);
        integerArrayList2.add(3);
        integerArrayList2.add(4);

        AlternatingIterator alternatingIterator = new AlternatingIterator(stringArrayList.iterator(),integerArrayList.iterator(),integerArrayList2.iterator());

        StringBuilder builder = new StringBuilder();

        while(alternatingIterator.hasNext()){
            builder.append(alternatingIterator.next());
        }

        assert(builder.toString().equals("cx1c1y2c2z3c3w4"));


    }


}
