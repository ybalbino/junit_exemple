package com.junitexemple.junit_exemple.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void test() {
        Person person = new Person();
        assertEquals("hello", person.hello());
    }
}