import modelLab3.University;
import controllerLab3.UniversityCreator;

public class lab3 {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }

}
