package chain_of_responsibility;

public abstract class GradeHandler {
    private GradeHandler successor;

    public GradeHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }

    public abstract void requestGrade(GradeRequest request);
}
