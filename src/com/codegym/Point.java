package com.codegym;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float setX(float x) {
        this.x = x;
        return x;
    }

    public float getY() {
        return y;
    }

    public float setY(float y) {
        this.y = y;
        return y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(float x, float y) {
        float[] array = new float[2];
        array[0] = setX(x);
        array[1] = setY(y);
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
