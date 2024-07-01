package simulacao_boot_camp;

import java.time.LocalDate;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	protected String titulo;
	protected String descricao;
	protected LocalDate data;
	
	public double calcularXP(){ 
		return getXpPadrao() + 20;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	
}
