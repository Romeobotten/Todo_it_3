package data;

import model.Person;

import java.util.Arrays;

public class People {

    private static Person[] peopleArray = new Person[0]; // An Array of Persons

    public int size() {
        return peopleArray.length;
    }

    public Person[] findAll() {
        return peopleArray;
    }

    public Person findById(int personId) {
        for (int i = 0; i < size(); i++) {
            if (peopleArray[i].getPersonId() == personId)
                return peopleArray[i];
        }
        return null;
    }

    public Person CreateNewPerson(String firstName, String lastName) {
        peopleArray = Arrays.copyOf(peopleArray,size() + 1);
              peopleArray[size() - 1] = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
              return peopleArray[size() - 1];
    }

    public void Clear() {
        peopleArray = Arrays.copyOf(peopleArray, 0);
    }
}