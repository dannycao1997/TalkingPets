package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class ReptileTest {
    private Reptile reptile;
    @Test
    public void testGetName(){
        Reptile reptile = new Reptile("Godzilla");
        Assert.assertEquals("Godzilla", reptile.getPetName());
    }
    @Test
    public void testSetName(){
        Reptile reptile = new Reptile("Godzilla");
        reptile.setPetName("Dragon");
        Assert.assertEquals("Dragon", reptile.getPetName());
    }
    @Test
    public void testSpeak() {
        Reptile reptile = new Reptile("Godzilla");
        String speak = "hssssh hsssh";
        Assert.assertEquals(speak, reptile.speak());
    }
}
