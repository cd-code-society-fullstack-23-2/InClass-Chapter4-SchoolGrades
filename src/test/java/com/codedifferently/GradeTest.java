package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    public void getSetNameTest(){
       // Given
        Grade grade = new Grade("Tyriq", "WuTang", 90.0);
       // When
       String expected = "Tariq";
       grade.setName("Tariq");
       String actual = grade.getName();
       // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSetAssignment(){
        // Given
        Grade grade = new Grade("Tariq", "Listen to MM", 90.0);
        // When
        String expected = "Listen to WuTang";
        grade.setAssignment("Listen to WuTang");
        String actual = grade.getAssignment();
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSetScore(){
        // Given
        Grade grade = new Grade("Tariq", "Grade Stuff", 90.0);
        // When
        Double expected = 100.00;
        grade.setScore(100.00);
        Double actual = grade.getScore();
        // Then
        Assertions.assertEquals(expected, actual);
    }
}
