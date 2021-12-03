package stringPract;


class Method {
	int a;
	
	
	Method(){
		a=7;
		System.out.println("axis bank intrest rate is"+a);
	}
	Method(int c){
		a=8;
		
		System.out.println("axis bank intrest rate is"+a);
	}
	static void me() {
		System.out.println("method");
		}
	
	
	static void me(int nm) {

		System.out.println(" parametrize method");
	}
	
	
	public static void main(String []args) {
		//Method m=new Method(1,7); 
		//Method kl=new Method(); 
		me(25);
		
		}
}