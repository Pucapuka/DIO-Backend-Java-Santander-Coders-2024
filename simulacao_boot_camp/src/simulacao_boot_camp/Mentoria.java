package simulacao_boot_camp;


public class Mentoria extends Conteudo {

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
