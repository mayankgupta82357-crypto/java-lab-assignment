// Roll No: BCS2025477 | Assignment 5 | Question 3
// Count values greater than 10
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;
        for (int value : arr) {
            if (value > 10) count++;
        }
        System.out.println("Count greater than 10: " + count);
    }
}
