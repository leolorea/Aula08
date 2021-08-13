import java.util.Scanner;

public class Desafio01 {	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
	Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornar um boolean false.
	A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.

		 * */
	
	static String estados[] = {"AC","AL","AP","AM","BA","CE","DF","ES"	,"GO"	,"MA"	,"MT"	,"MS"	,"MG ","PA"	,"PB"	,"PR"	,"PE"	,"PI"	,"RJ"	,"RN"	,"RS"	,"RO"	,"RR","SC",	"SP", "SE", "TO"};
	
	public static void main(String[] args) {
		System.out.println("Digite o seu estado para verifica��o de existencia: ");
		Scanner scanner = new Scanner(System.in);
		String estado = scanner.next();
		int fatorVerdade=0;
				
		for (int i = 0;i<estados.length; i++) {
			if (estados[i].equalsIgnoreCase(estado)) {
		
			fatorVerdade++;
			if (fatorVerdade>0) {System.out.println("O estado existe!");}}
			
				
	} if (fatorVerdade==0) {System.out.println("O estado n�o existe!");}
	scanner.close();
			
	

	
}
}
