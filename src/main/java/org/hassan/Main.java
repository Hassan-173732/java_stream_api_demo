package org.hassan;

import org.hassan.java_stream_demo.FilterAndMap;
import org.hassan.java_stream_demo.FindMaximum;
import org.hassan.java_stream_demo.StringManipulation;

public class Main {
    public static void main(String[] args) {
        FilterAndMap filterAndMapDemo = new FilterAndMap();
        StringManipulation stringManipulation = new StringManipulation();
        FindMaximum findMaximum = new FindMaximum();

        System.out.println("Filter And Map Demo !");
        System.out.println("Original List: " + filterAndMapDemo.getIntList());
        System.out.println("Modified List: " + filterAndMapDemo.GetListOfEvenNumber());


        System.out.println("String Manipulation Demo !");
        System.out.println("Original List: " + stringManipulation.getStringList());
        System.out.println("Modified String: " + stringManipulation.FilterOutStringWithLengthGreaterThanFourAndConcateTheRemaining());

        System.out.println("Find Maximum Demo !");
        System.out.println("Original List: " + findMaximum.getIntList());
        System.out.println("Modified String: " + findMaximum.FindMaximumNumberInList());
    }
}