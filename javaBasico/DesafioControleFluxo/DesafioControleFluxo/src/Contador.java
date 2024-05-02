import java.util.Scanner;

public class Contador {

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
    
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    
        
    }

    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }finally{
            terminal.close();
        }

    }
}
