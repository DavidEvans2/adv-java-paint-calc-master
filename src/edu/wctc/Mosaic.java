package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;

public class Mosaic implements Serializable, Paintable {
    static int muralCount;
    int num = 1;

    private ArrayList<Wall> wallList;


    public Mosaic(double length, double width) throws BadWidthException, BadHeightException {


        wallList = new ArrayList<Wall>();

        Wall wall = new Wall(width, length);
        wallList.add(wall);
    }

    public double getArea() {
        double area = 0;
        num = muralCount;
        muralCount++;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = wallList.get(i);
            area += w.getArea();
        }

        return area;
    }



    public String toString() {return "The mosaic has an area of " + getArea() + ".";
    }

    @Override
    public double getPremiumCost() {
        return 0;
    }

    @Override
    public double getStandardCost() {
        return 0;
    }
}