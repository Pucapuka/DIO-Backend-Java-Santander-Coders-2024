/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> fichaCriminal = new ArrayList<>();
		
		//coletando respostas
		System.out.println("Investigação Criminal (Responda '1' para SIM e '0' para não)");
		for(int i=1; i<=5; i++){
		    System.out.print(pergunta(i));
		    int resposta =  scan.nextInt();
		    fichaCriminal.add(i-1, resposta);
		}
		
		//checando resultado das respostas
		Iterator<Integer> resposta = fichaCriminal.iterator();
		int soma = 0;
		while(resposta.hasNext()){
		    if(resposta.next() == 1){
		        soma ++;
		    } 
		}
		
		//processando resultado final
	   System.out.println("A pessoa investigada é " + resultado(soma) + "!");
	}


public static String pergunta(int numero){
    switch(numero){
        case 1:
            return "Telefonou para a vítima?";
        
        case 2: 
            return "Esteve no local do crime?";
        
        case 3:
            return "Mora perto da vítima?";
         
        case 4: 
            return "Devia para a vítima?";
        
        case 5: 
            return "Já trabalhou com a vítima?";
        
        default:
            return "Valor inválido";
    }
}

public static String resultado(int soma){
    	if(soma==5)
		    return  "Assasina";
		else if(soma==3 || soma==4)
		    return "Cúmplice";
		else if(soma == 2)
		    return "Suspeita";
		else
		    return "Inocente";
}
}
