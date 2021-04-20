package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class AnalyseVector<T extends myVector> {
    // Fields
    private ArrayList<T> listVector;

    // Constructor
    public AnalyseVector(ArrayList<T> listVector) {
        this.listVector = listVector;
    }

    public ArrayList<T> analyse() {
        listVector.sort(new Comparator<myVector>() {
            @Override
            public int compare(myVector o1, myVector o2) {
                double v1;
                double v2;

                if (o1 instanceof Vector2D) {
                    v1 = ((Vector2D) o1).getVectorLength();
                    v2 = ((Vector2D) o2).getVectorLength();
                    return Double.compare(v1, v2);
                }
                if (o1 instanceof Vector3D) {
                    v1 = ((Vector3D) o1).getVectorLength();
                    v2 = ((Vector3D) o1).getVectorLength();
                    return  Double.compare(v1,v2);
                }
                return 0;
            }
        });
        return listVector;
    }
}
