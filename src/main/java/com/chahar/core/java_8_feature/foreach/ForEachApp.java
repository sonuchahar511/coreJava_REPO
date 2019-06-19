package com.chahar.core.java_8_feature.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApp{

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<10;i++){
            numbers.add( new Integer(i*10));
        }

        //INFO: forEach method implementation is defined in Iterable

        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println("inline implementation : "+ i);
            }
        } );

        numbers.forEach(new MyConsumer());

    }

}

class MyConsumer implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println("separate new class implementation: "+ i);
    }
}
