package com.company;

public class TriangleClassifier {

    public static String checkTriangle(double a, double b, double c) {
        String result = "";
        if (a == b && a == c) {
            result = "tam giác đều";
        } else if (a == b || a == c || b == c) {
            result = "tam giác cân";
        } else if (a > 0 && b > 0 && c > 0) {
            result = "tam giác thường";
        } else {
            result = "không là tam giác";
        }
        return result;
    }
}
