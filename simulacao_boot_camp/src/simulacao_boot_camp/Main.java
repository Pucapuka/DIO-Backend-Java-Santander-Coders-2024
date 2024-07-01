package simulacao_boot_camp;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

public class Main {

    private static final LocalDate agora = LocalDate.now();
    private static Set<Dev> devsSet = new HashSet<>();
    private static int devIndex = 1;

    public static void main(String[] args) {

        //instanciando todos os cursos e mentorias dispon�veis e, logo em seguida, instanciando
        //os bootcamps dispon�veis, adicionando seus respectivos cursos e mentorias.

        Curso curso1 = new Curso();
        curso1.setTitulo("HTML");
        curso1.setDescricao("Curso de estrutura��o de uma p�gina Web, utilizando a linguagem de marca��o HTML.");
        curso1.setCargaHoraria(222);
        curso1.setData(agora);
        

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS");
        curso2.setDescricao("Curso de estiliza��o da p�gina web, utilizando a linguagem de marca��o CSS.");
        curso2.setCargaHoraria(200);
        curso2.setData(agora);
       

        Curso curso3 = new Curso();
        curso3.setTitulo("JavaScript");
        curso3.setDescricao("Curso de programa��o que atuar� na p�gina web, tornando-a mais din�mica e interativa.");
        curso3.setCargaHoraria(300);
        curso3.setData(agora);
      

        Curso curso4 = new Curso();
        curso4.setTitulo("NodeJs");
        curso4.setDescricao("Curso da Runtime mais utilizada pelo JS. Aqui voc� vai aprender a gerir pacotes que tornam o seu desenvolvimento web mais pr�tico.");
        curso4.setCargaHoraria(100);
        curso4.setData(agora);
        

        Curso curso5 = new Curso();
        curso5.setTitulo("ReactJS");
        curso5.setDescricao("Uma das bibliotecas mais utilizadas no mundo front-end.");
        curso5.setCargaHoraria(100);
        curso5.setData(agora);
        

        Curso curso6 = new Curso();
        curso6.setTitulo("Java");
        curso6.setDescricao("Uma das linguagens de programa��o mais robustas da atualidade.");
        curso6.setCargaHoraria(400);
        curso6.setData(agora);
       

        Curso curso7 = new Curso();
        curso7.setTitulo("Programa��o Orientada a Objetos");
        curso7.setDescricao("Um dos paradigmas da programa��o mais demandados na atualidade.");
        curso7.setCargaHoraria(100);
        curso7.setData(agora);
        

        Curso curso8 = new Curso();
        curso8.setTitulo("Spring");
        curso8.setDescricao("Um framework Java criado para facilitar o desenvolvimento de aplica��es.");
        curso8.setCargaHoraria(200);
        curso8.setData(agora);
        

        Curso curso9 = new Curso();
        curso9.setTitulo("Testes Unit�rios");
        curso9.setDescricao("Aprenda a realizar testes do seu c�digo, aumentando sua produtividade.");
        curso9.setCargaHoraria(200);
        curso9.setData(agora);
     

        Curso curso10 = new Curso();
        curso10.setTitulo("Angular");
        curso10.setDescricao("Framework utilizado para gerar aplicativos de modo mais pr�tico.");
        curso10.setCargaHoraria(200);
        curso10.setData(agora);
        

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como iniciar na carreira de programa��o web.");
        mentoria1.setDescricao("Live com desenvolvedores que trabalham com desenvolvimento web, dando dicas de como estudar e treinar para se tornar um programador de sucesso.");
        mentoria1.setData(agora.plusDays(10));
      

        Mentoria mentoria1Java = new Mentoria();
        mentoria1Java.setTitulo("Como iniciar na carreira de programa��o em Java.");
        mentoria1Java.setDescricao("Live com desenvolvedores que trabalham com desenvolvimento Java, dando dicas de como estudar e treinar para se tornar um programador de sucesso.");
        mentoria1Java.setData(agora.plusDays(10));


        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Como gerenciar seu tempo durante o Bootcamp?");
        mentoria2.setDescricao("Live que aborda m�todos de gerenciamento de tempo, para evitar a procrastina��o e aproveitar ao m�ximo esse Bootcamp.");
        mentoria2.setData(agora.plusDays(30));


        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("A import�ncia do ingl�s na �rea de inform�tica.");
        mentoria3.setDescricao("Live com desenvolvedores que trabalham na gringa, falando da import�ncia vital da l�ngua inglesa para a �rea.");
        mentoria3.setData(agora.plusDays(50));
        

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("Como ter um curr�culo atrativo");
        mentoria4.setDescricao("Live com tech recruiters dando dicas de como real�ar o seu curr�culo e LinkedIn da melhor forma, tornando-os mais atrativos aos recrutadores.");
        mentoria4.setData(agora.plusDays(70));
        


        Bootcamp jsFullStack = new Bootcamp();
        jsFullStack.setNome("Bootcamp JS Full-Stack Developer");
        jsFullStack.setDescricao("Jornada de forma��o de desenvolvimento Full-Stack com JavaScript.");
        jsFullStack.getConteudos().add(curso1);
        jsFullStack.getConteudos().add(curso2);
        jsFullStack.getConteudos().add(curso3);
        jsFullStack.getConteudos().add(curso4);
        jsFullStack.getConteudos().add(curso5);
        jsFullStack.getConteudos().add(mentoria1);
        jsFullStack.getConteudos().add(mentoria2);
        jsFullStack.getConteudos().add(mentoria3);
        jsFullStack.getConteudos().add(mentoria4);


        Bootcamp java = new Bootcamp();
        java.setNome("Bootcamp Java Developer");
        java.setDescricao("Jornada de forma��o de desenvolvimento em Java.");
        java.getConteudos().add(curso6);
        java.getConteudos().add(curso7);
        java.getConteudos().add(curso8);
        java.getConteudos().add(curso9);
        java.getConteudos().add(curso10);
        java.getConteudos().add(mentoria1Java);
        java.getConteudos().add(mentoria2);
        java.getConteudos().add(mentoria3);
        java.getConteudos().add(mentoria4);


        //em um loop infinito (at� escolher sair), dando op��es para o candidato se inscrever
        //na plataforma e, em seguida, nos bootcamps.
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("DIO - Code Your Future!\nNovos Bootcamps abertos, apenas 10 vagas!");
            System.out.println("1. Quero me inscrever\n"
                    + "2. J� sou inscrito\n"
                    + "0. Sair;");
            int inscricao = scan.nextInt();
            scan.nextLine(); // Consume the newline character

            if (inscricao == 0) {
            	System.out.println("Saindo...");
                System.exit(0);
            }
            
            // Inscri��o do Dev na plataforma
            else if (inscricao == 1) {
                System.out.print("Por favor, digite o seu nome completo: ");
                String nomeCompleto = scan.nextLine();
                Dev dev = new Dev();
                dev.setNome(nomeCompleto);
                devsSet.add(dev);
                devIndex++;
                System.out.println("Inscri��o realizada com sucesso!");

            }
            // Acesso � conta
            else if (inscricao == 2) {
                System.out.println("Digite seu nome completo:");
                String nomeCompleto = scan.nextLine();
                Dev devEncontrado = null;
                for (Dev dev : devsSet) {
                    if (dev.getNome().equals(nomeCompleto)) {
                        devEncontrado = dev;
                        break;
                    }
                }
                if (devEncontrado != null) {
                	int opcao = 5; //um valor diferente das op��es para n�o impedir de entrar o loop nem afetar a escolha
                    while(opcao != 0) {
                	System.out.print("Bootcamps com matr�culas abertas: \n"
                            + "1. Desenvolvimento Full-Stack JavaScript\n"
                            + "2. Desenvolvimento Java\n"
                            + "3. Acessar curso\n"
                            + "0. Retornar ao menu anterior\n\n"
                            + "Escolha uma op��o: ");
                    
                    opcao = scan.nextInt();
                    scan.nextLine(); // Consume the newline character
                    switch (opcao) {
                        case 0:
                            break;
                        case 1:
                            devEncontrado.inscreverBootcamp(jsFullStack);
                            System.out.println("Inscri��o no bootcamp JS Full-Stack realizada com sucesso!");
                            break;
                        case 2:
                            devEncontrado.inscreverBootcamp(java);
                            System.out.println("Inscri��o no bootcamp Java realizada com sucesso!");
                            break;
                        case 3:
                            // Concluir curso
                        	int progredirOuSair = 5; //valor diferente dos outros para n�o sair do loop antes de entrar nem alterar as demais escolhas
                            while(progredirOuSair != 2 ||progredirOuSair != 0) {
	                        	System.out.println("1. Progredir\n"
	                                    + "2. Retornar\n"
	                                    + "3. Status\n"
	                                    + "0. Sair");
	                            System.out.print("Escolha: ");
	
	                            progredirOuSair = scan.nextInt();
	
	                            if (progredirOuSair == 0) {
	                                System.out.println("Saindo...");
	                                System.exit(0);
	                            } else if (progredirOuSair == 1) {
	                                devEncontrado.progredir();
	                            } else if (progredirOuSair == 2) {
	                                System.out.println("Retornando ao menu anterior");
	                                break;
	                            } else if (progredirOuSair == 3) {
	                            	System.out.print("\n\n");
	                                System.out.println("Nome: " + devEncontrado.getNome());
	                                System.out.println("Conteudos Inscritos: ");
	                                for (Conteudo cursos : devEncontrado.getConteudosInscritos()) {
	                                    System.out.println(cursos.getTitulo());
	                                }
	                                System.out.println("Conteudos Conclu�dos: ");
	                                for (Conteudo cursos : devEncontrado.getConteudosConcluidos()) {
	                                    System.out.println(cursos.getTitulo());
	                                }
	
	                                System.out.println("XP: " + devEncontrado.calcularTotalXP());
	                                System.out.println("\n\n");
	                            } else {
	                                System.out.println("Digite uma op��o v�lida!");
	                            }
	                          }
	                        
                            break;
                        default:
                            System.out.println("Escolha uma op��o v�lida!");
                            break;
                      }
                    }
                  
                }
            //inscri��o
            	else {
                    System.out.println("Voc� n�o est� inscrito na plataforma. Por favor, realize sua inscri��o.");
            		}
                }
        	else {
                System.out.println("Escolha uma op��o v�lida");
            	}
          }
       }
    }

