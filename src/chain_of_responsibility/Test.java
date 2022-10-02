package chain_of_responsibility;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GradeHandler bestGradeHandler = new BestGradeHandler();
        GradeHandler meritGradeHandler = new MeritGradeHandler();
        GradeHandler averageGradeHandler = new AverageGradeHandler();
        GradeHandler failGradeHandler = new FailGradeHandler();

        bestGradeHandler.setSuccessor(meritGradeHandler);
        meritGradeHandler.setSuccessor(averageGradeHandler);
        averageGradeHandler.setSuccessor(failGradeHandler);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Your Marks");
            double marks = scanner.nextDouble();
            bestGradeHandler.requestGrade(new GradeRequest(marks));
        }
    }
}
