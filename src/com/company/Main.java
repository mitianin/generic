package com.company;

public class Main {


    public static void main(String[] args) {

        ElementProcessor<Double> elementProcessor = new PrintArrayProcessor();
        ElementProcessor<Double> elementProcessor2 = new PrintRoundArrayProcessor();

        ArrayProcessor<Double> processor = new ArrayProcessor<>(new Double[]{5.432,43.632,2.41});


        processor.process(elementProcessor);
        System.out.println();
        processor.process(elementProcessor2);
    }


}
