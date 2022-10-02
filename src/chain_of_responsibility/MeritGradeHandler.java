package chain_of_responsibility;

public class MeritGradeHandler extends GradeHandler {
    @Override
    public void requestGrade(GradeRequest request) {
        double marks = request.getMarks();
        if (marks >= 60 && marks < 80) {
            System.out.format("Your Grade is %s for marks %f", "B", marks);
            return;
        }
        if (this.getSuccessor() != null) {
            this.getSuccessor().requestGrade(request);
        }
    }
}
