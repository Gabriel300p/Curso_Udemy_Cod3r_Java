package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		double celsius = 86;
		final int fahrenheit1 = 32;
		final double fahrenheit2 = 5.0 / 9.0;
		
		double convFarenheit = (celsius - fahrenheit1) * fahrenheit2;

		System.out.println(convFarenheit);
	}

}
