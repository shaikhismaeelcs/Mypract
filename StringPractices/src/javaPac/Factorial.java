package javaPac;

class Factorial{
public static void main(String[] args){

	int fact=1,num=8;
	for(int i=1;i<=num;i++){
	fact=fact*i;
	}
	System.out.println("factorial is"+fact+ "of "+num);
}
}