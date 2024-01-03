package com.junitexemple.junit_exemple.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @BeforeEach
    void conexaoBD(){
        System.out.println("Abrindo conexão com banco de dados.");
    }

    @AfterEach
    void fechandoBD(){
        System.out.println("Fechando a conexão com banco de dados.");
    }

    @Test
    @Disabled
    void groupAssertions(){
        Integer[] numbers = {0,1,2,3,4};
        assertAll("numbers", () -> assertEquals(false, new Number(numbers[1]).isEven()),
                () -> assertEquals(false, new Number(numbers[3]).isEven()),
                () -> assertEquals(true, new Number(numbers[4]).isEven())
        );
    }

    @Test
    void nullNumberTest(){
        Number number = new Number();
        assertNull(number.getValue());
        assertThrows(NullPointerException.class, () -> { number.isEven();});
    }

    @Test
    void negativeNumber2Test(){
        Number number = new Number(-2);
        assertEquals(true, number.isEven());
        assertEquals(false, number.isOdd());
    }

    @Test
    void negativeNumber1Test(){
        Number number = new Number(-1);
        assertEquals(false, number.isEven());
        assertEquals(true, number.isOdd());
    }

    @Test
    void number0Test(){
        Number number = new Number(0);
        assertEquals(true, number.isEven());
        assertEquals(false, number.isOdd());
    }

    @Test
    void number1Test(){
        Number number = new Number(1);
        assertEquals(false, number.isEven());
        assertEquals(true, number.isOdd());
    }

    @Test
    void number2Test(){
        Number number = new Number(2);
        assertEquals(true, number.isEven());
        assertEquals(false, number.isOdd());
    }


}