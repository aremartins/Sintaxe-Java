
public class Fatorial {
	public static void main(String[] args) {
		System.out.println("Imprimindo fatorial de 1 a 10:");
		int fatorial = 1;
		for(int i=1; i<=10; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + " = " +fatorial);
		}
	}
}
