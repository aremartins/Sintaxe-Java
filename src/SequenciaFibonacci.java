
public class SequenciaFibonacci {
	public static void main(String[] args) {
		int num = 0;
		int anterior = 0;
		
		for(int i =0; i <=25; i++) {
			anterior = num;
			num = num + i;
			
			
			System.out.println(anterior + " + " +  i  + " = " + num);
		}
	}

}
