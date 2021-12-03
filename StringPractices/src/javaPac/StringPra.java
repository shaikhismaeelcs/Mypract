package javaPac;

public class StringPra {

			public static void main(String[] args) 
			{
				String a = "Velocity";
				String b = "velocity";
			//	int d=30;		//d=30
				//int h=30;		//h=30
			
				boolean v = a.equals(b);	// false// it check refrence
				System.out.println(v); 
				
				v = a.equals("velocity");
				System.out.println(v); // false it// check refrence
				
				v = a.equalsIgnoreCase("velocity");
				System.out.println(v); // true
				
				 a = a.toUpperCase();
				System.out.println(a); // VELOCITY
				
				a = a.toLowerCase();
				System.out.println(a); // velocity
				
				int i = a.length();
				System.out.println(i); //8
				
				char x = a.charAt(3); // by using index of char at string
				System.out.println(x); // o
				
				b = "Velocity Batch 2021";  
				System.out.println(b.charAt(0)); // V
				
				String e = "Velocitylio";
				
				System.out.println(e.indexOf('i')); // 5 leftside
				System.out.println(e.lastIndexOf('i')); // 9 rightside
				
				String f = "Veliocitylio";
				
				System.out.println(f.indexOf("lio")); // 2
				System.out.println(f.lastIndexOf("lio")); // 9
				
				b = "Velocity";
				System.out.println(b.startsWith("Velo")); // true
				System.out.println(b.endsWith("ity")); // true
				
				b = "Velocity Batch 2021"; 
				System.out.println(b.substring(4)); // city Batch 2021
				System.out.println(b.substring(10,17)); // atch 20 
				
				b = "   Velocity Class Batch 2021  ";
				System.out.println(b);
				b=b.trim();
				System.out.println(b.contains("Velo"));
				System.out.println(b); //  Velocity Class Batch 2021 
			//	System.out.println(b.trim()); // Velocity Class Batch 2021 : removes space from starting & ending of String
			
				String c = "Velocity Class Batch 2021";
				System.out.println(c); // Velocity Class Batch 2021
				
				String [] z = c.split(" ");
				for(int j=0; j<z.length; j++)
				{
					System.out.print(z[j]); 
					/*
				    VelocityClassBatch2021 
					*/
				}	
				System.out.println(b.replace('t', 'k')); // Velociky Class Bakch 2021
				System.out.println(b.replace("ity", "ABC")); // VelocABC Class Batch 2021
				
				System.out.println(b); //  Velocity Class Batch 2021
				
				String k = "Velocity Class Batch 2021";
				k = "Velocity";
				System.out.println(k); // Velocity
				
				System.out.println(k.concat(" Class")); // Velocity Class
				System.out.println(k); // Velocity
				
				k = k + " Batch 2021";
				System.out.println(k); // Velocity Batch 2021
				
				String sg = "Champion";
				
				char [] st = sg.toCharArray();
				
				for(int n=(st.length-1);n>=0 ;n--)
				{
					System.out.print(st[n]+" "); 
	}
	}
}
