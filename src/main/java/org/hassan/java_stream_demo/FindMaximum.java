package org.hassan.java_stream_demo;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Getter
@NoArgsConstructor
public class FindMaximum {

    /*Find Maximum:
    Given a list of integers, find the maximum value using Java Streams.*/
    private final List<Integer> intList = List.of(2 , 5 , 7, 14, 10, 55, 66, 88, 96, 4, 11, 17, 24, 78, 87, 90);
    public Integer FindMaximumNumberInList(){
        return intList.stream().max(Integer::compareTo).orElse(null);
    }
}
