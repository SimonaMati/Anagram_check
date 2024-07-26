import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter the first word
		System.out.print("Enter the first word >> ");
		String word_1 = input.next().toLowerCase();
		
		//Enter the second word
		System.out.print("Enter the second word >> ");
		String word_2 = input.next().toLowerCase();
		
		//Invoke the function to compare the words
		isAnagram(word_1, word_2);
	}

	//Compares two words if they are anagrams
	public static void isAnagram(String a, String b) {
		String isAnagram = "Anagrams";

		if (a.length() != b.length()) {
			System.out.println("Not Anagrams");
			return;
		}

		// Put letters into an array of characters
		int[] arrayOfLetters1 = getCharArray(a);
		int[] arrayOfLetters2 = getCharArray(b);

		// Compare the letters from the second word with array of characters
		for (int i = 0; i < arrayOfLetters1.length; i++) {
		    if (arrayOfLetters1[i] != arrayOfLetters2[i]) {
		        System.out.println("Not Anagrams");
		        return;
		    }
		}

		System.out.println(isAnagram);
	}

	//Checks letter by letter of words
	public static int[] getCharArray(String word) {
		int[] arrayOfLetters = new int[26];

		for (char letter : word.toCharArray()) {
			int index = letter - 'a';
			arrayOfLetters[index]++;
		}
		return arrayOfLetters;
	}
}
