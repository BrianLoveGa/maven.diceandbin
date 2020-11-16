package com.github.curriculeon;

public class Bins {

    private final Bin[] bins;

    public Bins() {
        this(1, 12);
    }

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = (maxFaceValue - minFaceValue)+1;
        this.bins = new Bin[numberOfBins];
        for (int i = 0; i < bins.length; i++) {
            Integer currentValue = minFaceValue + i;
            bins[i] = new Bin(currentValue);
        }
    }

    public void incrementBin(Integer faceValueToIncrement) {
        Bin bin = getBin(faceValueToIncrement);
        bin.increment();
    }

    public Bin getBin(Integer faceValueToIncrement) {
        for (int i = 0; i < bins.length; i++) {
            Bin curr = bins[i];
            if (curr.getFaceValueToTrack().equals(faceValueToIncrement)) {
                return curr;
            }
        }
        return null;
    }

    public Bin[] getBins() {
        return bins;
    }
}
