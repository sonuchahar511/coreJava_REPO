package com.chahar.core.clonning.copyconstructor;

public class PointOne
{
    private Integer x;
    private Integer y;

    public PointOne(PointOne point) {
        this.x = point.x;
        this.y = point.y;
    }

    public PointOne(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) +
                "PointOne{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
