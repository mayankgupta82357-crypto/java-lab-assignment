// Roll No: BCS2025477 | Assignment 13 | Question 4
// Print all substrings
public class Main {
    public static void main(String[] args) {
        String word = "abc";
        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                System.out.println(word.substring(start, end));
            }
        }
    }
}
