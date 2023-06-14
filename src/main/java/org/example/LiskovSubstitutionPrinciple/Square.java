package org.example.LiskovSubstitutionPrinciple;

import static java.lang.Math.pow;

/**
 * Класс описывающий поведение квадарата с наследованием поведения прямой линии
 */
public class Square extends StraightLline {

    private StraightLline straightLline;
    public Square(int width) {
        super(width);
    }

    public int area() {
        return (int) pow(super.getWidth(),2);
    }
}
