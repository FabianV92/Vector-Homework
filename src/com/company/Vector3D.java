package com.company;

public class Vector3D implements  myVector{
    // Fields
    private Point3D point3D;
    private double x;
    private double y;
    private double z;
    private double vectorLength;

    // Constructor
    public Vector3D(Point3D point3D) {
        this.point3D = point3D;
        this.x = point3D.getX2() - point3D.getX1();
        this.y = point3D.getY2() - point3D.getY1();
        this.z = point3D.getZ2() - point3D.getZ1();

        this.vectorLength = Math.abs(Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2)));
    }




    @Override
    public double getVectorLength() {
        return vectorLength;
    }

    @Override
    public String toString() {
        return  String.format("The vector length is : %s, x: %s, y: %s, z: %s (3D)", vectorLength,x,y,z);
    }
}


