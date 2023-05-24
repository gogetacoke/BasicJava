package com.classroom.oop2;

public class Segment {
    Point start;
    Point end;

    public Segment(){
        this(new Point(1,1), new Point(1,1));
    }

    public Segment(Point start,Point end){
        this.start = start;
        this.end = end;
    }

    public double getLength(Point start,Point end){
       return Math.sqrt(Math.pow(start.getX() - end.getX(),2) + Math.pow(start.getY() - end.getY(),2));
   }

}
