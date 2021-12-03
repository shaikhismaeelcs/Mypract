package javaPac;
import java.lang.Math;  
public class ArmstsrongNumberExample  
		{  
	public static void main(String[] args) {  
		int digits=3, last=0, sum=0; 
		int n=153,temp=n;   
	 	while(temp>0)  
{        
		last = temp % 10;   
		sum = (int) (sum +  (Math.pow(last, digits)));   
		temp = temp/10;   
		}
		if(n==sum)   
		System.out.println("its amstrong");
		else {
			System.out.println("its not amstrong");
	}
}
}