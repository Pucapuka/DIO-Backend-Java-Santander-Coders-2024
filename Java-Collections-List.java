// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/
        
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
	    System.out.println(notas);
	    notas.add(10d);
	    System.out.println(notas);
	    notas.add(1d);
	    //remove o valor
	    System.out.println(notas.toString());
	    notas.remove(5d);
	    //remove o índice
	    notas.remove(3);
	    System.out.println(notas.toString());
	    System.out.println("Exibindo a posição da nota 10: "+ notas.indexOf(10d));
	    System.out.println("Adicionando o item 8.0 na posição 4");
        notas.add(4, 8d);
        System.out.println("Item da posição 4: " + notas.get(4));
        System.out.println("Substituindo a nota 10.0 pela nota 6.0");
        System.out.println("Antes de mudar: " + notas);
        notas.set(notas.indexOf(10d), 6d);
        System.out.println("Depois de mudar: " + notas);
        System.out.print("Checando se o item 5.0 está presente: ");
        System.out.println(notas.contains(5d));
        System.out.println("Exibindo todas as notas por linha: ");
        for(Double nota:notas){
            System.out.println(nota);
        }
        System.out.println("Exibindo a menor nota da lista: " + Collections.min(notas));
        System.out.println("Exibindo a maior nota da lista: " + Collections.max(notas));
    
        System.out.print("Trabalhando a soma total e a média das notas:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média das notas: " + soma/notas.size());
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Removendo as notas menores que 7.0 da lista:");
        //tem que criar outro iterador
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        System.out.println(notas);
        System.out.println("Apagando toda a lista:");
        notas.clear(); //dá algum erro utilizando esse método (ainda buscarei saber por que)
       // System.out.println("A lista está vazia? " + notas.isEmpty());
        }
	}
}
