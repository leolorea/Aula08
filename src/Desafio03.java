import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

	 * */
	public static void main(String[] args) {
		
		System.out.println("Vamos criar um triangulo, digite a medida do primeiro lado dele: ");
		Scanner scanner = new Scanner(System.in);
		int lado1 = scanner.nextInt();
		System.out.println("Digite a medida do segundo lado: ");
		int lado2 = scanner.nextInt();
		System.out.println("Digite a medida do terceiro lado: ");
		int lado3 = scanner.nextInt();
		if (trianguloExiste(lado1,lado2,lado3)) {
			System.out.println("O triangulo for criado com sucesso!");
			if (lado1==lado2 && lado2==lado3) {System.out.println("Você criou um triangulo equilatero");
			}else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
				System.out.println("Você criou um triangulo escaleno!");
			}else {System.out.println("Você criou um triangulo Isóceles!");}
			
		}else {System.out.println("Não foi possível criar se triangulo...");}
		scanner.close();
	}
	
	public static boolean trianguloExiste(int lado1, int lado2,int lado3) {
		if (lado1+lado2>lado3 &&lado2+lado3>lado1 &&lado1+lado3>lado2 ) {
			return true;
		}
		return false;
	}
}
