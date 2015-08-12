import java.util.Scanner;

public class EstruturaWhile{
	
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.print("Digite o numero final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		//Enquanto o numero atual menor igual a numerofinal
		while (numeroAtual <= numeroFinal){
			//Entra e execulta o código
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
	}
}