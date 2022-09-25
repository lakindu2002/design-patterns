package strategy;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent() {
        IFestival festival = new CodeFest();
        this.setFestival(festival);

        IProgram program = new BScProgram();
        this.setProgram(program);
    }

    @Override
    public void displayStudents() {
        System.out.println("Displaying Undergraduate Students");
    }
}
