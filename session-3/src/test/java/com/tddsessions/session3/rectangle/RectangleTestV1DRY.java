package com.tddsessions.session3.rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTestV1DRY {

    private Rectangle rectangles[];

    @BeforeEach
    void setUp() {
        Rectangle rectangle = Rectangle.create(10, 5);
        Rectangle square = Rectangle.createSquare(10);

        rectangles = new Rectangle[] {rectangle, square};
    }

    @Test
    void calculateArea() {
        int expectedAreas[] = {50, 50};

        for (int i = 0; i < rectangles.length; i++) {
            assertEquals(expectedAreas[i], rectangles[i].area());
        }
    }

    @Test
    void calculatePerimeter() {
        int expectedPerimeters[] = {30, 35};

        for (int i = 0; i < rectangles.length; i++) {
            assertEquals(expectedPerimeters[i], rectangles[i].perimeter());
        }
    }
}