package com.company;

public class PrintRoundArrayProcessor implements ElementProcessor<Double> {

    @Override
    public void run(Double ob) {
        System.out.print(Math.round(ob) + " ");
    }
}
