import java.util.Scanner;

public class Desafio02 {
	/*Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de 100 (com exce��o dos anos que forem m�ltiplos de 400).
Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto� ou �O ano informado n�o � bissexto).
A main do seu programa deve conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto retornado.


	 * */
	public static void main(String[] args) {
		System.out.println("Digite o ano desejado para verificar se ele � bissexto: ");
		Scanner scanner = new Scanner(System.in);
		int anoDigitado = scanner.nextInt();
		if ((anoDigitado%4==0) &&(anoDigitado%100==0) && (anoDigitado%400 ==0) ) {
			System.out.println("O ano � bissexto!");
		}else if ((anoDigitado%4==0) &&(anoDigitado%100!=0)){System.out.println("O ano � bissexto!");}else {
			System.out.println("O ano N�o � bissexto!");
		}
					scanner.close();
		}
		
		
	
}
