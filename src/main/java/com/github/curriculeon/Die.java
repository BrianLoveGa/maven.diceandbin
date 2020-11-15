package com.github.curriculeon;

import java.util.concurrent.ThreadLocalRandom;

public class Die {

    private Integer numberOfFaces;
    private Integer currentFaceValue;


    public Die() {
        this(6);
    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
        ThreadLocalRandom randNumbGen = ThreadLocalRandom.current();
        this.currentFaceValue = randNumbGen.nextInt(1,numberOfFaces);
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;    }

    public Integer getNumberOfFaces() {
        return numberOfFaces;    }
}

/// laissez les bons temps rouler !!!