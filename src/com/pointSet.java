package com;

/**
 * Created by Celia on 10/11/2016.
 */
class pointSet {
    double x;
    double y;
    double z;
    pointSet (double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    void setX (double _x) {
        x = _x;
    }
    void setY (double _y) {
        y = _y;
    }
    void setZ (double _z) {
        z = _z;
    }

    double getDistance (pointSet p) {
        return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z);
    }
}
class TestPoint {
    public static void main (String args[]) {
        pointSet p = new pointSet(1.0, 2.0, 3.0);
        pointSet p1 = new pointSet(0.0, 0.0, 0.0);
        System.out.println(p.getDistance(p1));
        p.setX(5.0);
        System.out.println(p.getDistance(new pointSet(3.0, 4.0, 5.0)));
    }

}