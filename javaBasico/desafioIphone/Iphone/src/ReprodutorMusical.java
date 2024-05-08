import java.util.Scanner;

// ReprodutorMusical.java
public class ReprodutorMusical {
    Scanner terminal = new Scanner(System.in);

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.print("Escolha a música: ");
        musica = terminal.next();
        System.out.println("Selecionando música: " + musica);
    }
}