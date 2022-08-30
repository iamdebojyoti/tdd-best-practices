package com.tddsessions.session3.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTestV3DAMP {

    @Test
    void calculateAreaOfRectangle() {
        Rectangle rectangle = Rectangle.create(10, 5);

        int area = rectangle.area();

        assertEquals(50, area);
    }

    @Test
    void calculateAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(10);

        int area = square.area();

        assertEquals(100, area);
    }

    @Test
    void calculatePerimeterOfRectangle() {
        Rectangle rectangle = Rectangle.create(10, 5);

        int perimeter = rectangle.perimeter();

        assertEquals(30, perimeter);
    }

    @Test
    void calculatePerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(10);

        int perimeter = square.perimeter();

        assertEquals(40, perimeter);
    }
}