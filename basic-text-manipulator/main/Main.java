package main;

import java.util.Scanner;

public class Main {
    static String string1;
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a word");
        string1 = stdin.nextLine();
        string1 = string1.toLowerCase();
		wordConverter();
	}

	public static void wordConverter() {
		int count = 0;
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < string1.length(); i++)
        {
                char ch = string1.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                                ch == 'o' || ch == 'u')
                {
                        vowels++;
                }
                else
                { 
                        consonants++;
                }
        }
        System.out.format("Your word contains exactly %d Vowels and %d Consonants.", vowels, consonants);
	}
}