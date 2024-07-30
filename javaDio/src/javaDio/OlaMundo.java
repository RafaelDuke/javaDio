package javaDio;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String []args) {
		System.out.println("Olá Mundo");
		System.out.println("Olá Mundoo");
		System.out.println("Finalmente consegui");
		
		int a = 2024;
		int b;
		int result;
		
		Scanner leia = new Scanner(System.in);	

		System.out.println("Informe a sua data de nascimento");
		b = leia.nextInt();
		System.out.println("Sua idade é: ");
		result = (a - b);
		System.out.println(result);
		
		
	}
	
}
