package data;

import model.Person;

import java.util.Arrays;

public class People {

    private static Person[] peopleArray = new Person[0]; // An Array of Persons

    public static int size() {
        return peopleArray.length;
    }

    public static Person[] findAll() {
        return peopleArray;
    }

    public static Person findById(int personId) {
        for (int i = 0; i < size(); i++) {
            if (peopleArray[i].getPersonId() == personId) {
                return peopleArray[i];
            }
        }
        return null;
    }

    public static Person CreateNewPerson(String firstName, String lastName) {
        peopleArray = Arrays.copyOf(peopleArray,size() + 1);
              peopleArray[size() - 1] = new Person(firstName, lastName);
              return peopleArray[size() - 1];
    }

    public static void Clear() {
        peopleArray = Arrays.copyOf(peopleArray, 0);
    }
}