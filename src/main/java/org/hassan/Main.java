package org.hassan;

import org.hassan.java_stream_demo.FilterAndMap;

public class Main {
    public static void main(String[] args) {
        FilterAndMap filterAndMapDemo = new FilterAndMap();

        System.out.println("Filter And Map Demo !");
        System.out.println("Original List: " + filterAndMapDemo.getIntList());
        System.out.println("Modified List: " + filterAndMapDemo.GetListOfEvenNumber());

    }
}