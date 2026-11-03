import static java.lang.Math.round;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][] marks = new int[5][3];
    int sum = 0;
    int total = 0;
    // filling the array, adding sum


    System.out.println("Student marks:");
    for(int i = 0; i<5; i++){
        for(int j = 0; j<3; j++){
            marks[i][j] = (int)(Math.random() * 10)+1;
            sum = sum + marks[i][j];
            total ++;
            if (marks[i][j] > 9) {
                System.out.print(marks[i][j] + "| ");
            } else {
                System.out.print(marks[i][j] + " | ");
            }
        }

        System.out.println();
    }

    int avg = Average(sum, total);
    String result = Result(avg);

    System.out.println("Student mark average: "+ avg);
    System.out.println("Student mark status: " + result);
}

private int Average(int sum, int total){
    int avg = sum / total;
    return avg;
}

private String Result (int avg){
    return switch(avg){
        case 10, 9 -> "Excellent";
        case 8, 7 -> "Good";
        case 6, 5 -> "Pass";
        default -> "Needs improvement";
    };
}
