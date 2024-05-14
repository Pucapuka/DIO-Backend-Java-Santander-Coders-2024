/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioProposto1{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        System.out.println("Abaixo, digite o valor das temperaturas dos meses do ano");
        for(int i=1; i<=6; i++){
            System.out.print(getMeses(i) + ": ");
            temperaturas.add(i-1, scan.nextDouble());
        }
        System.out.println("\nTemperaturas dos 6 primeiros meses:");
        for(double temperatura:temperaturas){
            System.out.println(temperatura);
        }
        //somando para calcular a média
        //somando e calculando a média
        Iterator<Double> iterator = temperaturas.iterator();
        
        double somaTemperaturas = 0d;
        while(iterator.hasNext()){
            somaTemperaturas += iterator.next();
        }
        double tempMedia = somaTemperaturas/temperaturas.size();
        System.out.println("Temperatura média Semestral: " + tempMedia);

        //Temperatura acima da média
        System.out.println("Temperaturas acima da média: ");
       for(int i=0; i<temperaturas.size(); i++){
            if(temperaturas.get(i) > tempMedia)
                System.out.print(getMeses(i+1) + ": " + temperaturas.get(i) + "\n");
        }
        //Temperatura abaixo da média
        System.out.println("Temperaturas abaixo da média: ");
        for(int i=0; i<temperaturas.size(); i++){
            if(temperaturas.get(i) < tempMedia)
                System.out.print(getMeses(i+1) + ": " + temperaturas.get(i) + "\n");
        }
        
        scan.close();
      
        }
   

public static String getMeses(int mes){
    switch(mes){
        case 1:
            return "Janeiro";
        case 2:
            return "Fevereiro";
        case 3:
            return "Março";
        case 4:
            return "Abril";
        case 5:
            return "Maio";
        case 6:
            return "Junho";
        default:
            return "Mês inválido";
        }
    }
}