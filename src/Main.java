import StringManipulation.Anagram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String string1 = scanner.next();

        System.out.print("Enter String 2: ");
        String string2 = scanner.next();

        if(Anagram.isAnagram(string1, string2))
            System.out.println(string1 + " and " + string2 + " are Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
