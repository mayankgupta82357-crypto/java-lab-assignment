// Roll No: BCS2025477 | Assignment 8 | Question 3
// Calculate each row sum
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < m.length; row++) {
            int sum = 0;
            for (int col = 0; col < m[row].length; col++) {
                sum += m[row][col];
            }
            System.out.println("Row " + (row + 1) + " sum: " + sum);
        }
    }
}
