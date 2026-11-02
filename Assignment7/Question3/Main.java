// Roll No: BCS2025477 | Assignment 7 | Question 3
// Count repeated halving steps
public class Main {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;
        // Time complexity: O(log n), because n is halved each iteration.
        while (n > 1) {
            n /= 2;
            steps++;
        }
        System.out.println("Halving steps: " + steps);
    }
}
