package chain_of_responsibility;

public class BestGradeHandler extends GradeHandler {
    @Override
    public void requestGrade(GradeRequest request) {
        double marks = request.getMarks();
        if (marks > 79 && marks <= 100) {
            System.out.format("Your Grade is %s for marks %f", "A", marks);
            return;
        }
        if (this.getSuccessor() != null) {
            this.getSuccessor().requestGrade(request);
        }
    }
}
