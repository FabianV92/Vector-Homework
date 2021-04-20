package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<myVector> list = new ArrayList<>(Arrays.asList(
                new Vector2D(new Point2D(0,13,0,0)),
                new Vector2D(new Point2D(0,23,0,0)),
                new Vector2D(new Point2D(0,5,0,0)),
                new Vector3D(new Point3D(0,0,0,5,0,0))
        ));

        list.forEach(System.out::println);
        System.out.println("---------------------");
        AnalyseVector<myVector> analyseList = new AnalyseVector<>(list);
        analyseList.analyse().forEach(System.out::println);
        System.out.println("---------------------");
    }
}
