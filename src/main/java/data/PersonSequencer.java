package data;

public class PersonSequencer {
private static int personId = 100;

public static int nextPersonId(){
    PersonSequencer.personId++;
    return PersonSequencer.personId;
    }
public static void reset(){
    PersonSequencer.personId = 100;
}
    
}
