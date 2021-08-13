import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

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
			if (lado1==lado2 && lado2==lado3) {System.out.println("Voc� criou um triangulo equilatero");
			}else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
				System.out.println("Voc� criou um triangulo escaleno!");
			}else {System.out.println("Voc� criou um triangulo Is�celes!");}
			
		}else {System.out.println("N�o foi poss�vel criar se triangulo...");}
		scanner.close();
	}
	
	public static boolean trianguloExiste(int lado1, int lado2,int lado3) {
		if (lado1+lado2>lado3 &&lado2+lado3>lado1 &&lado1+lado3>lado2 ) {
			return true;
		}
		return false;
	}
}
