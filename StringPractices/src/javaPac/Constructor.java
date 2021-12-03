package javaPac;

public class Constructor {
	int a;
	
	Constructor(int b){
		a=40;
	}
	Constructor(char h){
		a=80;
	}
	public static void main(String[] s) {
	Constructor c=  new Constructor('i');
		System.out.println(c.a);
	}
}