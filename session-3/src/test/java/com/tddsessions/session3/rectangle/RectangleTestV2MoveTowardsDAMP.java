package com.tddsessions.session3.rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTestV2MoveTowardsDAMP {

    private Rectangle rectangles[];

    @BeforeEach
    void setUp() {
        Rectangle rectangle = Rectangle.create(10, 5);
        Rectangle square = Rectangle.createSquare(10);

        rectangles = new Rectangle[] {rectangle, square};
    }

    @Test
    void calculateAreaOfRectangle() {
        int area = rectangles[0].area();

        assertEquals(50, area);
    }

    @Test
    void calculateAreaOfSquare() {
        int area = rectangles[1].area();

        assertEquals(50, area);
    }

    @Test
    void calculatePerimeterOfRectangle() {
        int perimeter = rectangles[0].perimeter();

        assertEquals(30, perimeter);
    }

    @Test
    void calculatePerimeterOfSquare() {
        int perimeter = rectangles[1].perimeter();

        assertEquals(35, perimeter);
    }
}