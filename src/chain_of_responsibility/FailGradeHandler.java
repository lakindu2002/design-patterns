package chain_of_responsibility;

public class FailGradeHandler extends GradeHandler {
    @Override
    public void requestGrade(GradeRequest request) {
        double marks = request.getMarks();
        if (marks < 40) {
            System.out.format("Your Grade is %s for marks %f", "F", marks);
            return;
        }
        if (this.getSuccessor() != null) {
            this.getSuccessor().requestGrade(request);
        }
    }
}
