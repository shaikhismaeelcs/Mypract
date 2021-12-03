package javaPac;

public class Arr {
	
	public static void main(String[] args) {
		//int arr []=new int[4];
		int arr[]= {1,2,25,30,5,6};
		try
		{
			System.out.println(arr[8]);
		}
		
		catch (ArrayIndexOutOfBoundsException y){
			System.out.println("array out of bound");
			
		
			try {
			System.out.println(arr[7]);
			}
			catch(Exception t){
			System.out.println("array out of bound");
			}
			//finally {
			//	System.out.println("checked 4th index array");
		//	}	
			
		//finally {
		//	System.out.println("checked 5th index array");
	//	}
		int a = 4,b = 4;
		int c=a+b;
			System.out.println(c);
		//}
	}
}}