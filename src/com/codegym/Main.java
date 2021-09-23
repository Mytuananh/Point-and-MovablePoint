package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Point point = new Point(2, 3);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(4, 5);
        movablePoint.setX(4);
        movablePoint.setY(5);
        System.out.println(Arrays.toString(movablePoint.Moveable()));
    }
}
