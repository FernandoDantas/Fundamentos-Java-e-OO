
public class Pedalar {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Fernando";
		
		
		Bicicleta bicicleta = new Bicicleta();
		p1.bicicleta = bicicleta;
		
		p1.bicicleta.marca = "Caloi";
		
		VoltaDeBicicleta pedalar = new VoltaDeBicicleta();
		pedalar.andar(p1);
		
	}	
	

}
