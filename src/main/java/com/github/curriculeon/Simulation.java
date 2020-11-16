package com.github.curriculeon;

import java.util.Formatter;

public class Simulation {


    private final Dice dice;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.dice = new Dice(numberOfDie);
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(dice.getRollMin(), dice.getRollMax());
    }

    public void run() {
        //Dice dice = new Dice();
        bins = new Bins (dice.getRollMin(), dice.getRollMax());
        for (int i=0; i < numberOfTosses; i++){
            Integer faceValue = dice.rollAndSum();
            bins.incrementBin(faceValue);
        }
    }

    public Double getPercentageOfOccurrences(Integer faceValueToCheck) {
        Bin bin = bins.getBin(faceValueToCheck);
        Integer numberOfOccurrences = bin.getNumberOfOccurrences();
        Double ratio = numberOfOccurrences.doubleValue() / numberOfTosses;
        return ratio * 100;     ///// < ---- to make a percentage * 100 here  --- //////
    }

    @Override
    public String toString() {
        Formatter outPut = new Formatter();
        for(Bin bin : bins.getBins()) {
            // doing math
            Integer faceValue = bin.getFaceValueToTrack();
            Integer numberOfOccurrences = bin.getNumberOfOccurrences();
            Double percentage = getPercentageOfOccurrences(faceValue);

            // formatting string
            Integer starCount = percentage.intValue();
            String stars = new String(new char[starCount]).replace("\0", "*");
            outPut.format("%d : %d: %.2f: %s%n", faceValue, numberOfOccurrences, percentage, stars);
        }
        return outPut.toString();
    }

    public Bins getBins() {
        return bins;
    }
}
