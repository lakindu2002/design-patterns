package chain_of_responsibility;

public class AverageGradeHandler extends GradeHandler {
    @Override
    public void requestGrade(GradeRequest request) {
        double marks = request.getMarks();
        if (marks > 39 && marks <= 60) {
            System.out.format("Your Grade is %s for marks %f", "C", marks);
            return;
        }
        if (this.getSuccessor() != null) {
            this.getSuccessor().requestGrade(request);
        }
    }
}
