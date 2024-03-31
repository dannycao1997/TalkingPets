package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;
public class FishTest {
    private Fish fish;
    @Test
    public void testGetName(){
        Fish fish = new Fish("Bubbles");
        Assert.assertEquals("Bubbles", fish.getPetName());
    }
    @Test
    public void testSetName(){
        Fish fish = new Fish("Bubbles");
        fish.setPetName("Koi");
        Assert.assertEquals("Koi", fish.getPetName());
    }
    @Test
    public void testSpeak() {
        Fish fish = new Fish("Bubbles");
        String speak = "bloop bloop";
        Assert.assertEquals(speak, fish.speak());
    }
}
