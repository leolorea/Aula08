import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o c�lculo do sal�rio de um professor, dispon�vel em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as fun��es que julgar necess�rias para obter cada um dos valores que fazem parte do sal�rio de um professor
	 * */
	public static void main(String[] args) {
		System.out.println("Calculadora de salario dos professores... se voc� for professor aulista digite 1, se for mensalista digite 2");
		Scanner scanner = new Scanner(System.in);
		int tipoProfessor = scanner.nextInt();
		if (tipoProfessor==1) {
		
		System.out.println("Digite o numero de aulas semanais: ");
		
		double horasSemanais = scanner.nextDouble();
		System.out.println("Digite o valor hora aula pago: ");
		double valorHoraAula = scanner.nextDouble();
		double salarioBase =  ((horasSemanais*valorHoraAula)*4.5);
		System.out.println("O Salario base do professor � : " + salarioBase + 
				" Mais um adicional de hora-atividade de : " + 0.05*salarioBase);}
		else if (tipoProfessor==2) {
			System.out.println("Digite o valor hora aula pago: ");
			double valorHoraAula = scanner.nextDouble();
			System.out.println("O Salario base do professor : " + (23*4.5*valorHoraAula) + " Mais um adicional de hora-atividade de : " + 0.05*(23*4.5*valorHoraAula));
		}
		
	}
}
