package com.company;

public class ArrayProcessor<T> {
    private T[] array;

    public ArrayProcessor(T[] array) {
        this.array = array;
    }

    public void process(ElementProcessor<T> elementProcessor) {
        for (T element : array
        ) {
            elementProcessor.run(element);
        }
    }
}
