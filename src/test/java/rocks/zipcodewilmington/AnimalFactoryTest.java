package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        String name = "Charlie";
        Date birthDate = new Date();
        Dog dog =  AnimalFactory.createDog(name,birthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void testCreateCat(){
        String name = "Professor Walter Cattens";
        Date birthDate = new Date(2012, 4,9);
        Cat cat = AnimalFactory.createCat(name, birthDate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }


}
