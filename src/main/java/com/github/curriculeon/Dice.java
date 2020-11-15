package com.github.curriculeon;

public class Dice {

    private final Die[] dice;

    /**
     * @param numberOfDie - number of die-objects to be contained
     */
    public Dice(Integer numberOfDie) {
        this(numberOfDie, 6);
    }

    /**
     * @param numberOfDie - number of die-objects to be contained
     * @param numberOfFaces - number of faces on a single die-object
     */
    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.dice = new Die[numberOfDie];

        for (int i = 0; i < dice.length; i++){
            Die die = new Die(numberOfFaces);
            dice[i]= die;
        }

    }

    /**
     * Create a random number from 1 to 6 for each dice you roll
     * sum all of the random numbers up and that equals total for that roll
     */
    public Integer rollAndSum() {
        Integer total = 0;

        for (int j = 0; j < dice.length; j++){
            Die currentElement = dice[j];
            currentElement.roll();
            int youRolledValue = currentElement.getCurrentFaceValue();
            total += youRolledValue;
        }
        return total;
    }

    /**
     * @return the absolute minimum value that can be rolled by this set of die
     */
    public Integer getRollMin() {
        Integer numberOfDie = dice.length;
        Integer minimumValueToBeRolled = numberOfDie;
        return minimumValueToBeRolled;
    }

    /**
     * @return the absolute maximum value that can be rolled by this set of die
     */
    public Integer getRollMax() {
        Die oneOfTheDie = dice[0]; // look at one of the die
        Integer numberOfFaces = oneOfTheDie.getNumberOfFaces(); // count number of faces
        Integer numberOfDie = dice.length; // count number of die
        Integer maximumValueToBeRolled = numberOfFaces * numberOfDie;
        return maximumValueToBeRolled;
    }
}
