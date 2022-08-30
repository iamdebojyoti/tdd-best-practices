package com.tddsessions.session3.rectangle;

public class Rectangle {

    private int length;
    private int breadth;

    private Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(int length) {
        return new Rectangle(length, length);
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}
