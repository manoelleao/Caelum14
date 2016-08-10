
public class StringC14_3 {
	
	public static void main(String args[]){
		
		String frase = "socorram-me, subi no ônibus em Marrocos";
		String[] array1 = frase.split(" ");
		String invert = "";
		for(int i = array1.length - 1 ; i >=0 ; i--){
		  invert +=array1[i] + " ";
		}
		System.out.println(invert);
		
		
		
		
	/*String frase = "socorram-me, subi no ônibus em Marrocos";
		String invert[]=frase.split(" ");
		
		System.out.print(invert[0]+" ");
		System.out.print(invert[1]+" ");
		System.out.print(invert[2]+" ");
		System.out.print(invert[3]+" ");
		System.out.print(invert[4]+" ");*/
}}
