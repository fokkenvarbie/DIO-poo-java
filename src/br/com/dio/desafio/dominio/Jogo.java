package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Jogo {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    
    private Set<Personagem> personagensInscritos = new HashSet<>(); 
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    
    public Set<Personagem> getPersonagensInscritos() { 
        return personagensInscritos;
    }
    
    public void setPersonagensInscritos(Set<Personagem> personagensInscritos) { 
        this.personagensInscritos = personagensInscritos;
    }
    
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, personagensInscritos, conteudos);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Jogo jogo = (Jogo) o; 
        
        return Objects.equals(nome, jogo.nome) && 
               Objects.equals(descricao, jogo.descricao) && 
               Objects.equals(dataInicial, jogo.dataInicial) && 
               Objects.equals(dataFinal, jogo.dataFinal) && 
               Objects.equals(personagensInscritos, jogo.personagensInscritos) && 
               Objects.equals(conteudos, jogo.conteudos);
    }
}