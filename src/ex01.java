import java.util.Scanner;

public class ex01 {
	static String estados[] = {"AC","AL","AP","AM","BA","CE","DF","ES"	,"GO"	,"MA"	,"MT"	,"MS"	,"MG ","PA"	,"PB"	,"PR"	,"PE"	,"PI"	,"RJ"	,"RN"	,"RS"	,"RO"	,"RR","SC",	"SP", "SE", "TO"};
	static String digitaEstado;
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		digitaEstado = scanner.next();
				System.out.println(verificaEstado(digitaEstado));
				
		

		
	}
	public static boolean verificaEstado(String estado) {
		
			
			for (int i=0;i<estados. i++) {
				if (estados.equalsIgnoreCase(estados[i])) {
				return true;
				
				}else return false;
			
			
	}
	
}
	}
	
