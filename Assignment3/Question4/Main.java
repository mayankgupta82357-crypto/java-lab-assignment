// Roll No: BCS2025477 | Assignment 3 | Question 4
// Upside-down triangle of stars
public class Main {
    public static void main(String[] args) {
        for (int row = 4; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
