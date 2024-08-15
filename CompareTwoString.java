import java.sql.SQLOutput;

public class CompareTwoString {
    public static void main(String[] args) {
        System.out.println("MABC".compareTo("GXYZ"));
        System.out.println("MABC".compareTo("MABC"));
        // We want to compare a specific part of two strings, for example:
// "Alakhphy pandey sir" and "Ashutos pandey". We aim to compare the word "pandey" in both strings.
// In the first string (s1), "pandey" starts at index 9, while in the second string (s2),
// it starts at index 8.
// The length of "pandey" is 6, so these values are used in the regionMatches() method.

        String s1 = "Alakhphy pandey sir";
        String s2 = "Ashutos pandey";
        System.out.println(s1.regionMatches(9, s2, 8, 6));

    }
}
