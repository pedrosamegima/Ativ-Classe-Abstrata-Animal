package AtivAnimal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo ("Bob","Masculino","lobo preto");
		System.out.println("nome: "+lobo.getNome());
		System.out.println("sexo: " +lobo.getSexo());
		System.out.println("raca: "+lobo.getRaca());
		lobo.emitirsom();
		System.out.println("------------------------------------------------");
		
		Tigre tigre = new Tigre ("Bob","Masculino","Tigre laranja");
		System.out.println("nome: "+tigre.getNome());
		System.out.println("sexo: " +tigre.getSexo());
		System.out.println("raca: "+tigre.getRaca());
		tigre.emitirsom();
		
		System.out.println("---------------------------------------------------");
		
		Leao leao = new Leao ("Bob","Masculino","leao amarelo");
		System.out.println("nome: "+leao.getNome());
		System.out.println("sexo: " +leao.getSexo());
		System.out.println("raca: "+leao.getRaca());
		leao.emitirsom();
		
		System.out.println("----------------------------------------------------");
		
		
		Gato gato = new Gato ("Bob","Msculino","Gato branco e preto");
		System.out.println("nome: "+gato.getNome());
		System.out.println("sexo: " +gato.getSexo());
		System.out.println("raca: "+gato.getRaca());
		gato.emitirsom();
		
		System.out.println("--------------------------------------------------------");
		
		Cachorro cachorro = new Cachorro ("Bob","Msculino","Cachorro Laranja");
		System.out.println("nome: "+cachorro.getNome());
		System.out.println("sexo: " +cachorro.getSexo());
		System.out.println("raca: "+cachorro.getRaca());
		cachorro.emitirsom();
		
		
	}

	}

