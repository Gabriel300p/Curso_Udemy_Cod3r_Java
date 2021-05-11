package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//Tipos númericos Inteiros
		byte anosDeEmpresa = 127;
		short numeroDeVoos = 542;
		int id = 57843;
		long pontosAcumulados = 3_234_845_234L;
		
		//Tipos númericos reais
		float salario = 11_445.44F; 
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //false
		
		//Tipo caractere
		char status = 'a';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
