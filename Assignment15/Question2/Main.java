// Roll No: BCS2025477 | Assignment 15 | Question 2
// Append numbers and remove final comma
public class Main {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(",");
        }
        numbers.deleteCharAt(numbers.length() - 1);
        System.out.println(numbers);
    }
}
