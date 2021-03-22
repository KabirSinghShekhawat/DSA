package StringManipulation;

public class Anagram {
    public static boolean isAnagram(String string1, String string2) {
        int[] charFrequency = new int[256];

        for (char ch: string1.toCharArray()) ++charFrequency[(int) ch];

        for (char ch: string2.toCharArray()) --charFrequency[(int) ch];

        for (char ch: string1.toCharArray()) {
            if(charFrequency[(int) ch] != 0)
                return false;
        }
        return true;
    }
}
