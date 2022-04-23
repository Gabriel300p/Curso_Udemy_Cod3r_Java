package fundamentos;

public class OperadorLogico {
	
	public static void main(String[] args) {
		// Trabalho na terça V ou F
		// Trabalho na quinta V ou F
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		
		System.out.println("Comprou TV 50? " + comprouTv50);
	}

}
