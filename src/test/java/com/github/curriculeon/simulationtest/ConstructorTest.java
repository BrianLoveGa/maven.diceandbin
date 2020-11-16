package com.github.curriculeon.simulationtest;

import com.github.curriculeon.Simulation;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test(expected = NullPointerException.class)
    public void test0() {
        // given
        Integer numberOfDie = null;
        Integer numberOfTosses = null;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNull(simulation.getBins());
    }

    @Test
    public void test1() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfTosses = null;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation.getBins());
    }

    @Test
    public void test2() {
        // given
        Integer numberOfDie = 1;
        Integer numberOfTosses = 1;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation.getBins());
    }

    @Test
    public void test3() {
        // given
        Integer numberOfDie = 2;
        Integer numberOfTosses = 3;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation.getBins());
    }

    @Test
    public void test4() {
        // given
        Integer numberOfDie = 9999999;
        Integer numberOfTosses = 99999999;

        // when
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);

        // then
        Assert.assertNotNull(simulation.getBins());
    }
}
