import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametroDois = scan.nextInt();
        try{
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
        scan.close();
        }
        
    

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if( parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int numeroFinal = parametroDois - parametroUm;
        for(int i = 0; i < numeroFinal; i++){
            System.out.println("Imprimindo o numero " + (i + 1));
        }
        numeroFinal++;
    }
    
}
