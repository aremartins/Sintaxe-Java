
public class TestaLacos2 {
	public static void main(String[] args) {
		System.out.println("Imprimindo uma matrix triangular usando o comando break:");
		for(int linha=0; linha <=10; linha++) {
			for(int coluna = 0; coluna <=10; coluna++) {
				if(coluna > linha ) {
					break; //Para a execu��o do la�o mais interno que cont�m o comando break e continua executando os la�os mais externos.
				}
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
}
