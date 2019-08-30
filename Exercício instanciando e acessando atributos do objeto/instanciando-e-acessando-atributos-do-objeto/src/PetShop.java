
public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = "Bidu";		
	    cachorro.idade = 1;
	    cachorro.raca = "Boxer";
	    cachorro.sexo = 'M';
	    
	    System.out.println("Seu cachorro");
	    System.out.println("-----------------------");	
	    System.out.println("Nome: " + cachorro.nome);
	    System.out.println("Idade: " + cachorro.idade);
	    System.out.println("Raça: " + cachorro.raca);
	    System.out.println("Sexo: " + cachorro.sexo);
	    
	    
	    Cachorro meuCachorro = new Cachorro();
	    
	    meuCachorro.nome = "Brutus";		
	    meuCachorro.idade = 2;
	    meuCachorro.raca = "Labrador";
	    meuCachorro.sexo = 'M';
	    
		System.out.println();
	    System.out.println("Meu cachorro");
	    System.out.println("-----------------------");	    
	    System.out.println("Nome: " + meuCachorro.nome);
	    System.out.println("Idade: " + meuCachorro.idade);
	    System.out.println("Raça: " + meuCachorro.raca);
	    System.out.println("Sexo: " + meuCachorro.sexo);
	}
	
}
