package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Simulation sim = new Simulation(3, 1000);
        sim.run();
        String output = sim.toString();
        System.out.println(output);
    }
}
