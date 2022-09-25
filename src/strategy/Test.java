package strategy;

public class Test {
    public static void main(String[] args) {
        Student poStudents = new PostgraduateStudent();
        poStudents.offerPrograms();
        poStudents.conductEvents();
        poStudents.displayStudents();

        System.out.println("==========ASSIGN NEW EVENT TO POST GRAD STUDENT===============");
        poStudents.setFestival(new CodeFest());
        poStudents.conductEvents();

        System.out.println("==============================================================");

        Student unStudent = new UndergraduateStudent();
        unStudent.offerPrograms();
        unStudent.conductEvents();
        unStudent.displayStudents();

        System.out.println("==========================ASSIGN NEW PROGRAM ====================================");
        unStudent.setProgram(new MScProgram());
        unStudent.offerPrograms();

    }
}
