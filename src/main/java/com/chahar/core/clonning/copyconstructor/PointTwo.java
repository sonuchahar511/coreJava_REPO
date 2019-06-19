package com.chahar.core.clonning.copyconstructor;

public class PointTwo extends PointOne{
    private Integer z;

    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }

    public PointTwo(Integer x, Integer y, Integer z)
    {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "PointTwo{" +
                "z=" + z +
                '}';
    }
}
