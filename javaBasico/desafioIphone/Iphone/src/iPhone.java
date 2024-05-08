
// iPhone.java
public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    private boolean ativado;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
        this.ativado = false;
    }

    public void ativar() {
        this.ativado = true;
        System.out.println("iPhone ativado!");
    }

    public void usarReprodutorMusical() {
        if (!ativado) {
            System.out.println("Por favor, ative o seu iPhone primeiro.");
            return;
        }
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Nome da Música");
    }

    public void usarAparelhoTelefonico() {
        if (!ativado) {
            System.out.println("Por favor, ative o seu iPhone primeiro.");
            return;
        }
        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        if (!ativado) {
            System.out.println("Por favor, ative o seu iPhone primeiro.");
            return;
        }
        navegadorInternet.exibirPagina("https://www.exemplo.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }

        public static void main(String[] args) {
            iPhone meuIPhone = new iPhone();
            meuIPhone.ativar();
    
            System.out.println("### Utilizando o Reprodutor Musical ###");
            meuIPhone.usarReprodutorMusical();
    
            System.out.println("\n### Utilizando o Aparelho Telefônico ###");
            meuIPhone.usarAparelhoTelefonico();
    
            System.out.println("\n### Utilizando o Navegador de Internet ###");
            meuIPhone.usarNavegadorInternet();
        }
    
}



