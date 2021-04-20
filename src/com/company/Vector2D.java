package com.company;

public class Vector2D implements myVector {
    // Fields
    private Point2D point2D;
    private double vectorLength;
    private double x;
    private double y;

    // Construcor
    public Vector2D(Point2D point2D) {
        this.point2D = point2D;
        this.x = point2D.getX2() - point2D.getX1();
        this.y = point2D.getY2() - point2D.getY1();

        vectorLength =Math.abs(Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)));
    }

    @Override
    public double getVectorLength() {
    return  vectorLength;
    }

    @Override
    public String toString () {
        return String.format("The vector length is : %s, x: %s, y: %s (2D)", vectorLength,x,y);
    }
}
