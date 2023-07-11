package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setNameTest2(){
        String expected = "Elvi";
        Dog dog = new Dog("Tennessee", null, 0);
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testSetBirthDate(){
        Date expected = new Date();
        Dog dog = new Dog("", null, null);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetBirthDate2(){
        Date expected = new Date(2018, 12, 4);
        Dog dog = new Dog("Scrappy", new Date(2014,2, 3), 42);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSpeak(){
        String expected = "bark!";
        Dog dog = new Dog(null, null, null);
        String actual = dog.speak();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testEat(){
        int expected = 1;
        Dog dog = new Dog(null, null, null);
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetId(){
        int expected = 901;
        Dog dog = new Dog("Twinkie", new Date(), expected);
        int actual = dog.getId();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInheritance(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
        Assert.assertTrue(dog instanceof Mammal);
    }
}

