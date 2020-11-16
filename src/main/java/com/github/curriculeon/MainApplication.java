package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {cd dev  
        Simulation sim = new Simulation(2, 100);
        sim.run();
        String output = sim.toString();
        System.out.println(output);
    }
}
