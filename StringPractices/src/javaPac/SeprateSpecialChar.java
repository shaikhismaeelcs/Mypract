package javaPac;

public class SeprateSpecialChar {
	public static void main(String[] args) {
		String S = "ajajAls*868*&^%djdjalGGF";
		S=S.replaceAll("[^a-zA-Z0-9]", "Q");
		System.out.println(S);
	}
}