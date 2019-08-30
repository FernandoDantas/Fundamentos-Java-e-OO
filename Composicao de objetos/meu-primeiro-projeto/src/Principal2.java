
public class Principal2 {

	public static void main(String[] args) {		
		
		Carro meuCarro = new Carro();
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		
		
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "João da silva";
		meuCarro.dono.cpf = "052.050.550-20";
		meuCarro.dono.idade = 25;
		meuCarro.dono.logradouro = "Rua João pinheiro, 10";
		meuCarro.dono.bairro = "Centro";
		
	}
	
}
