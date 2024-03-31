package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    private Bird bird;
    @Test
    public void testGetName(){
        Bird bird = new Bird("Tweety");
        Assert.assertEquals("Tweety", bird.getPetName());
    }
    @Test
    public void testSetName(){
        Bird bird = new Bird("Tweety");
        bird.setPetName("Ducky");
        Assert.assertEquals("Ducky", bird.getPetName());
    }
    @Test
    public void testSpeak() {
        Bird bird = new Bird("Bubbles");
        String speak = "quack quack";
        Assert.assertEquals(speak, bird.speak());
    }
}

