package strategy;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent() {
        IProgram doctoralProgram = new DoctoralPrograms();
        this.setProgram(doctoralProgram);

        IFestival festival = new RoboFest();
        this.setFestival(festival);
    }

    @Override
    public void displayStudents() {
        System.out.println("Displaying Postgraduate Students");
    }
}
