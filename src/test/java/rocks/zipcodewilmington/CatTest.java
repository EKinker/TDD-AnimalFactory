package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName1() {
        Cat cat = new Cat("",null, 0);
        String expected = "Roxy";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @ Test
    public void testSetName2() {
        String expected = "Little Mayhem";
        Cat cat = new Cat("Default Shelter Name", null, null);
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        Cat cat = new Cat("", null, 0);
        Date expected = new Date();
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate2(){
        Date expected = new Date();
        Cat cat = new Cat(null, expected, null);
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSpeak(){
        Cat cat = new Cat("Professor Cattens", null, null);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSpeak2(){
        String expected = "meow!";
        Cat cat = new Cat("Walter", null, null);
        String actual = cat.speak();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCatEat() {
        Cat cat = new Cat("Loki", null, null);

        int startingMeals = cat.getNumberOfMealsEaten();
        int expectedMeals = startingMeals + 1;

        cat.eat(new Food());
        int actualMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedMeals, actualMeals);
    }

    @Test
    public void testCatEat2() {
        Cat cat = new Cat("", null, null);
        int expectedMeals = 1;

        //Food food = new Food();
        //cat.eat(food);
        cat.eat(new Food());
        int actualMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(actualMeals, expectedMeals);
    }

    @Test
    public void testGetId(){
        Cat cat = new Cat ("Lucy", null, 53);
        int expected = 53;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetId2(){
        int expected = 234;
        Cat cat = new Cat(null, null, expected);
        int actual = cat.getId();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat ("", null, 0);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat("", null, 0);
        Assert.assertTrue(cat instanceof Mammal);

    }
}
