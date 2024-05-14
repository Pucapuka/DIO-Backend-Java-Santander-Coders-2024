/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

import java.util.*;

public class Main{
    
    public static void main(String[] args){
        //Criando uma lista com o nome notas2
        List<Double> notas2 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Primeira nota da lista: " + notas2.get(0));
        System.out.println("Vou remover a primeira nota");
        Double notaRemovida = notas2.remove(0);
      System.out.println("Removendo a primeira nota: " + notaRemovida);
      System.out.println(notas2);
    }
}
