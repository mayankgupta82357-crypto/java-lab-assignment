// Roll No: BCS2025477 | Assignment 9 | Question 3
// Count values greater than 5
public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int count = 0;
        for (int[] row : m) {
            for (int value : row) {
                if (value > 5) count++;
            }
        }
        System.out.println("Values greater than 5: " + count);
    }
}
