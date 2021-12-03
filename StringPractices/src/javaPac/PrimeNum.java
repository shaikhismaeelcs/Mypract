package javaPac;

import java.util.Scanner;

public class PrimeNum {


		  public static void main(String[] args) {

		   int num=14;
		//   Scanner sc=new Scanner(System.in);
		  // num=sc.nextInt();
		   
		   boolean flag= true;
		   for(int i=2;i<=num/2;++i) {
			   if(num%i==0)
			   {
				   flag=false;
				   break;
				   }
		   }
		    if (flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}