package org.hassan.java_stream_demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Getter

@NoArgsConstructor
public class FilterAndMap {
    private final List<Integer> intList = List.of(2 , 5 , 7, 14, 10, 55, 66, 88, 96, 4, 11, 17, 24, 78, 87, 90);

     public List<Integer> GetListOfEvenNumber(){
         return  intList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
    }


}
