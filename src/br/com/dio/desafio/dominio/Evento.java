package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Evento extends Conteudo {

    private LocalDate data;
    
    @Override
    public double calcularXp() {
        return Conteudo.XP_PADRAO + 20d;
    }

    public Evento() {
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Evento [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }
}