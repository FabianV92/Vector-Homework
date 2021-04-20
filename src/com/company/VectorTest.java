package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {
    // Fields
    Vector2D test1;
    Vector3D test3D;

    @Before
    public void vor() {
        test1 = new Vector2D(new Point2D(0,5,0,0));
        test3D = new Vector3D(new Point3D(0,0,5,0,0,0));
    }


    // Testing the before cases
    @Test
    public void theTest() {
        Assert.assertTrue(5 == test1.getVectorLength());
        Assert.assertTrue(5 == test3D.getVectorLength());
    }

    // Testing if result is not null
    @Test
    public void theTest1() {
        Assert.assertNotNull(test1);
        System.out.println("test");
        Assert.assertNotNull(test3D);
    }

}
