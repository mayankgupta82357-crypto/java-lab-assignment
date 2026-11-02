// Roll No: BCS2025477 | Assignment 8 | Question 1
// Fill and print a 3 by 4 matrix
public class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int value = 1;

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = value++;
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
}
