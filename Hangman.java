import java.util.*;
import java.io.*;



public class Hangman{

	
	
	public static void main(String[] args)throws FileNotFoundException{
		
		Scanner scan = new Scanner(new File("C:/Users/sonam/OneDrive/Desktop/UNB/java projects/hangman/words.txt"));
		Scanner keyboard = new Scanner(System.in);
		
		List<String> words = new ArrayList<>();
		while(scan.hasNext()){
			words.add(scan.nextLine());
		}
		
		Random random = new Random();
		
		String word = words.get(random.nextInt(words.size()));
	
	    System.out.println(word);
	
		List<Character> playerGuesses = new ArrayList<>();
		
		printState (word,playerGuesses);
		
		
		System.out.println("Enter a letter.");
		String letter = keyboard.nextLine();
		
		playerGuesses.add(letter.charAt(0));
		printState(word,playerGuesses);
	
		
	}
	
	private static void printState(String word,List<Character> playerGuesses){
		for(int i = 0;i < word.length();i++){
			if(playerGuesses.contains(word.charAt(i))){
				System.out.print(word.charAt(i));
			}
			else{
				System.out.print("-");
			}
		}
		System.out.println();
	}

}