package com.beginning_spring.chapter3;

public interface Normalizer {
    default String transform(String input) {
        return input.trim();
    }
}
