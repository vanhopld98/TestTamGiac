package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void Test1() {
        String expected = "tam giác đều";
        String actual = TriangleClassifier.checkTriangle(2, 2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String expected = "tam giác cân";
        String actual = TriangleClassifier.checkTriangle(2, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void Test3() {
        String expected = "tam giác thường";
        String actual = TriangleClassifier.checkTriangle(1, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    void Test4() {
        String expected = "không là tam giác";
        String actual = TriangleClassifier.checkTriangle(-1, 2, 3);
        assertEquals(expected, actual);
    }
}