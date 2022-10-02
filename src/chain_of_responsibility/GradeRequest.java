package chain_of_responsibility;

public class GradeRequest {
    private double marks;

    public GradeRequest(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
