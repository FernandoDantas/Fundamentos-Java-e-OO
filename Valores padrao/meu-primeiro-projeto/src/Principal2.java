
public class Principal2 {

	public static void main(String[] args) {		
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Fiat";
		seuCarro.modelo = "Palio";
		seuCarro.anoDeFabricacao = 2003;
		seuCarro.cor = "Prata";		
		
		seuCarro.dono.nome = "João";
	}
	
}
