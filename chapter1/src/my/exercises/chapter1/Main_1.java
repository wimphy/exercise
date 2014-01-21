package my.exercises.chapter1;

public class Main_1 {
	public static void main(String[] args) {

		// For main function
		System.out.println("I rule.");
		System.out.println("The world");

		// For == & equal
		String s1 = "aaa";
		String s2 = "aaa";
		String s3 = s1;
		String s4 = new String("aaa");

		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s1==s4: " + (s1 == s4));
		System.out.println("s1.equals(s4)): " + (s1.equals(s4)));

		System.out.println("");
	}

	public boolean equals(Object obj) {
		return true;
	}
}
