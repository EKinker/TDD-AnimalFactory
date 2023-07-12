package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){

        Dog dog = new Dog("Bobbi", new Date(), 42);
        DogHouse.clear();
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(42);
        Assert.assertEquals(dog, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        int id = 4815;
        Dog dog = new Dog("Kiki", new Date(), id);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(id);

        Assert.assertNull(DogHouse.getDogById(id));
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog() {
        int id = 162342;
        Dog dog = new Dog("", null, id);
        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(id));
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        //given
        int id = 450;
        Dog dog = new Dog("Charles X", null, id);

        //when
        DogHouse.clear();
        DogHouse.add(dog);

        //then
        Dog actual = DogHouse.getDogById(id);
        Assert.assertEquals(dog, actual);

    }


    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        int expected = 1;
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
       int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs2(){
        //given 2 dogs
        int expected =2 ;
        String dog1Name = "Amy";
        Date dog1BirthDate = new Date();
        Dog dog1 = AnimalFactory.createDog(dog1Name, dog1BirthDate);

        String dog2Name = "Elvi";
        Date dog2BirthDate = new Date();
        Dog dog2 = AnimalFactory.createDog(dog2Name, dog2BirthDate);

        DogHouse.clear(); //if I don't do this and we run all the tests, it will add to the existing amount
        //When
        DogHouse.add(dog1);
        DogHouse.add(dog2);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}
