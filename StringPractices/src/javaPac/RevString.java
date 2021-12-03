package javaPac;
public interface RevString {
	static void woman() {
		System.out.println("hello");
	}
	 void men();
	 int a=10;
	public default void gen()
	 {
		 System.out.println("default");
	 }
	} 
class box implements RevString{
	public void men() {
		System.out.println("hi");
	}
	public void gen()
	 {
		 System.out.println("defaultof class");			
			 }
	public static void main(String[] args) {
		RevString.woman();
	}
}