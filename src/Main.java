void main() {
    int[][] marks = marks();
    double[] studentAvg = new double[marks.length];

    printMarks(marks, studentAvg);
    printResults(studentAvg);
}

private static void printMarks(int[][] marks, double[] studentAvg) {
    System.out.println("Student marks:");
    for (int i = 0; i < marks.length; i++) {
        int studentSum = 0;

        for (int j = 0; j < marks[i].length; j++) {
            studentSum += marks[i][j];

            if (marks[i][j] > 9) {
                System.out.print(marks[i][j] + "| ");
            } else {
                System.out.print(marks[i][j] + " | ");
            }
        }

        studentAvg[i] = calculateAverage(studentSum, marks[i].length);
        System.out.println();
    }
}

private static void printResults(double[] studentAvg) {
    for (int i = 0; i < studentAvg.length; i++) {
        String result = calculateResult(studentAvg[i]);
        System.out.println("Student " + (i + 1) + " average = " +
                studentAvg[i] + " | Result = " + result);
    }
}

private static double calculateAverage(int sum, int total) {
    double avg = (double) sum / total;
    return Math.round(avg * 100.0) / 100.0;
}
private static String calculateResult(double avg) {
    int roundedAvg = (int) Math.round(avg);
    return switch (roundedAvg) {
        case 10, 9 -> "Excellent";
        case 8, 7 -> "Good";
        case 6, 5 -> "Pass";
        default -> "Needs improvement";
    };
}

private static int[][] marks() {
    return new int[][] {
            {5, 9, 7},
            {8, 6, 5},
            {7, 3, 9}
    };
}