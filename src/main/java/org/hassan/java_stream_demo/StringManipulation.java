package org.hassan.java_stream_demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class StringManipulation {

    /*String Manipulation:
    Given a list of strings, use Java Streams to filter out the strings that have length less than 3 and concatenate the remaining strings into a single comma-separated string.*/

    private final List<String> stringList = List.of("Apple", "Boy", "Table", "Girl", "Toy", "PC", "Iphone");

    public String FilterOutStringWithLengthGreaterThanFourAndConcateTheRemaining(){
        return stringList.stream().filter(word -> word.length() >= 4).collect(Collectors.joining(", "));
    }

}
