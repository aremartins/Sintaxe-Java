
public class ImprimeFatorial {
	public static void main(String[] args) {
		System.out.println("Imprimindo fatorial de um n�mero de entrada:");
		int entrada = 5;
		int fatorial = 1;

		for (int i = 1; i <= entrada; i++) {
			fatorial = fatorial * i;			
		}
		System.out.println("Fatorial de " + entrada + " = " +fatorial);

	}

}
