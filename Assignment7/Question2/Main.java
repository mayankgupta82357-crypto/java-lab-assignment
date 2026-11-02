// Roll No: BCS2025477 | Assignment 7 | Question 2
// Count steps in nested loops
public class Main {
    public static void main(String[] args) {
        int steps = 0;
        // Time complexity: O(n^2), as both loops run n times.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
