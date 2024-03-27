package controllerLab3;
import modelLab3.Human;
import modelLab3.Faculty;
import modelLab3.University;
import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {


    public   University createUniversity(String name, int facultyCount, Human president) {
        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();
        university.setName(name);
        university.setPresident(president);
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 1; i < facultyCount; i++) {
            faculties.add(facultyCreator.createTypicalFaculty());
        }
        university.setFaculties(faculties);

        return university;

    }

    public  University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        University university = createUniversity("NTU", 3, humanCreator.createTypicalPerson());

        return university;
    }

}

