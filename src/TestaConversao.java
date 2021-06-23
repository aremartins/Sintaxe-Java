public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
        
        float pontoFlutuante = 3.14f;
        
        long numeroGrande = 32434256532L;
        short valorPequeno = 2131;
        byte muitoPequeno = 127;
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double valor3 = valor1 + valor2;
        
        System.out.println(valor3);        
        
    }
}
