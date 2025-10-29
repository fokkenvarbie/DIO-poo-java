package br.com.dio.desafio.dominio;

public class Missao extends Conteudo {
    
    private int totalAtividades;
    
    @Override
    public double calcularXp() {
        return Conteudo.XP_PADRAO * totalAtividades;
    }

    public Missao() {

    }
    
    public int getTotalAtividades() { 
        return totalAtividades;
    }
    
    public void setTotalAtividades(int totalAtividades) {
        this.totalAtividades = totalAtividades;
    }

    @Override
    public String toString() {
        return "Missao [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", totalAtividades=" + totalAtividades + "]";
    }
}