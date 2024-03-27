package controllerLab4;

import modelLab4.Human;
import modelLab4.Sex;

public class HumanCreator {
    public Human createPerson(String firstName, String lastName, String middleName, Sex gender) {
        Human person = new Human();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMiddleName(middleName);
        person.setGender(gender);
        return person;
    }
    public  Human createTypicalPerson(){
        return createPerson("Roger", "Gol", "D", Sex.MALE);
    }
}

