package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    protected String titulo;
    protected int cargaHoraria;

    public Curso(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public double calculaXp() {
        return XP_PADRAO + 50d;
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

    @Override
    public String toString() {
        return "Curso {" +
                "Titulo: " + titulo  +  " | Carga Horária: " + cargaHoraria + "h" + "}";
    }
}
