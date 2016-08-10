
public class StringC14_2 {
	public static void main(String args[]){
		String frase1="socorram-me, subi no ônibus em Marrocos";
		
		char[] frase = new char[frase1.length()];
         
	        for (int i = frase1.length() - 1, j = 0; i >= 0; i--, j++) {  
	            frase[j] = frase1.charAt(i);  
	        }  
	          
	        System.out.println(frase);  
	        
	        ///////////////////
	        
	        
	        String frase2="anotaram a data da maratona";
			
			char[] fras = new char[frase1.length()];
	         
		        for (int i = frase2.length() - 1, j = 0; i >= 0; i--, j++) {  
		            fras[j] = frase2.charAt(i);  
		        }  
		          
		        System.out.println(fras); 
	}

}
