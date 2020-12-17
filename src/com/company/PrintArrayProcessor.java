package com.company;

public class PrintArrayProcessor implements ElementProcessor<Double> {

    @Override
    public void run(Double ob) {
        System.out.print(ob + " ");
    }
}
