public class StringMutation {
	public static void main(String[] args) {
		String phrase = "See you in 2021!";
		String mut1, mut2, mut3, mut4;

		mut1 = phrase.concat(" Hope you are ok!");
		//mut1 = "Hope you are ok! ".concat(phrase);

		mut2 = mut1.toUpperCase();
	
		mut3 = mut2.replace('E', 'X');

		mut4 = mut3.substring(2, 8);

		System.out.println("Phrase: " + phrase);
		System.out.println("Mut1: " + mut1);
		System.out.println("Mut2: " + mut2);
		System.out.println("Mut3: " + mut3);
		System.out.println("Mut4: " + mut4);
	}
}
