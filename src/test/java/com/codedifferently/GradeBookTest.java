package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

    @Test
    public void addGradeTest01(){
        // Given
        GradeBook gradeBook = new GradeBook(10);
        Grade grade = new Grade("Test Student","Assignment", 75.00);
        // When
        Boolean actual = gradeBook.addGrade(grade);
        Assertions.assertTrue(actual);
    }

    @Test
    public void addGradeTest02(){
        // Given
        GradeBook gradeBook = new GradeBook(0);
        Grade grade = new Grade("Test Student","Assignment", 75.00);
        // When
        Boolean actual = gradeBook.addGrade(grade);
        Assertions.assertFalse(actual);
    }

    @Test
    public void sizeTest01(){
        // Given
        GradeBook gradeBook = new GradeBook(10);
        Grade grade = new Grade("Test Student","Assignment", 75.00);
        // When
        gradeBook.addGrade(grade);
        Integer expectedSize = 1;
        Integer actualSize = gradeBook.size();

        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void sizeTest02(){
        // Given
        GradeBook gradeBook = new GradeBook(10);
        Grade grade = new Grade("Test Student","Assignment", 75.00);
        // When
        Integer expectedSize = 0;
        Integer actualSize = gradeBook.size();

        Assertions.assertEquals(expectedSize, actualSize);
    }
}
