// Roll No: BCS2025477 | Assignment 8 | Question 2
// Transpose a matrix
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
}
