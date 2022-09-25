package strategy;

public abstract class Student {
    private IFestival festival;
    private IProgram program;

    public abstract void displayStudents();

    public void setFestival(IFestival festival) {
        this.festival = festival;
    }

    public void setProgram(IProgram program) {
        this.program = program;
    }

    public void offerPrograms() {
        this.program.offerPrograms();
    }

    public void conductEvents() {
        this.festival.performEvent();
    }
}
