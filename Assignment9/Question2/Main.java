// Roll No: BCS2025477 | Assignment 9 | Question 2
// Calculate each column sum
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int col = 0; col < m[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            System.out.println("Column " + (col + 1) + " sum: " + sum);
        }
    }
}
