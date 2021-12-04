package javaPac;

public class Revs {
	public static void main(String[] args) {
		String c="india";
		String b="";
		for (int i=(c.length()-1);i>=0;i--) {
			b=b+(c.charAt(i));
			
		}
		System.out.println(b);
	}

}