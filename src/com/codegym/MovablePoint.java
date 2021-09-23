package com.codegym;

public class MovablePoint extends Point {
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MovablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public float setXspeed(float xspeed) {
        this.xspeed = xspeed;
        return xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public float setYspeed(float yspeed) {
        this.yspeed = yspeed;
        return yspeed;
    }
    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = xspeed;
        array[1] = yspeed;
        return array;
    }

    public void setSpeed(float xspeed, float yspeed) {
        float[] array = new float[2];
        array[0] = setXspeed(xspeed);
        array[1] = setYspeed(yspeed);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
    public float[] Moveable() {
        float[] array = new float[2];
        array[0] = super.getX() + xspeed;
        array[1] = super.getY() + yspeed;
        return array;
    }
}
