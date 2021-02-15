package com.beginning_spring.chapter3.mem03;

import com.beginning_spring.chapter3.Normalizer;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;
import java.util.stream.Stream;

@Component("bar")
public class CapLeadingNormalizer implements Normalizer {
    @Override
    public String transform(String input) {
        StringJoiner joiner = new StringJoiner(" ");
        Stream
                .of(input.trim().split("\\s"))
                .filter(s -> !s.isEmpty())
                .map(s ->
                        Character.toUpperCase(s.charAt(0)) +
                                s.substring(1).toLowerCase()
                )
                .forEach(joiner::add);
        return joiner.toString();
    }
}