package javaPac;

public class RevStrings {
	
	public static void main(String args[])  
	{  
	String s="selenium";  
	String r="";
	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter a String: ");  
	//s=sc.nextLine();                    //reading string from user  
	System.out.println("After reverse string is: ");  
	for(int i=(s.length())-1;i>=0;--i)                //i is the length of the string  
	{  
	r=r+s.charAt(i);            //printing the character at index i-1  
	} 
	System.out.println(r);
	}  
	
}
