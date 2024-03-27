package controllerLab4;


import modelLab4.Human;
import modelLab4.Student;

public class StudentCreator {


    public Student createStudent(Human person, int studentId) {


        Student student = new Student();
        student.setFirstName(person.getFirstName());
        student.setLastName(person.getLastName());
        student.setMiddleName(person.getMiddleName());

        student.setStudentId(studentId);
        student.setGender(person.getGender());

        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human typicalPerson = humanCreator.createTypicalPerson();
        Student typicalStudent = createStudent(typicalPerson, 12345678);
        return typicalStudent;
    }

}

