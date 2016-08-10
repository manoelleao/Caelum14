
public class StringC14_4 {
	
public static void main(String args[]){
		
		String frase = "socorram-me, subi no ônibus em Marrocos";

	        inverteComStringBuilder(frase);

	    }

	   static void inverteComStringBuilder(String texto) {
	         System.out.print("\t");
	         StringBuilder invert = new StringBuilder(texto).reverse();
	         System.out.println(invert);
	     }
		
		
	
}


