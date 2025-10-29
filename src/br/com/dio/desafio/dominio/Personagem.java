package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Personagem {
    private String nome;
    
    private Set<Conteudo> missoesAtivas = new LinkedHashSet<>();
    private Set<Conteudo> missoesConcluidas = new LinkedHashSet<>();

    public void iniciarJogo(Jogo jogo){
        this.missoesAtivas.addAll(jogo.getConteudos());
        jogo.getPersonagensInscritos().add(this); 
    }

    public void progredir() {
        Optional<Conteudo> missaoAtual = this.missoesAtivas.stream().findFirst();
        if(missaoAtual.isPresent()) {
            this.missoesConcluidas.add(missaoAtual.get());
            this.missoesAtivas.remove(missaoAtual.get());
        } else {
            System.err.println("Você não possui missões ativas no momento!");
        }
    }

    public double calcularScoreTotal() {
        return this.missoesConcluidas
             .stream()
             .mapToDouble(missao -> missao.calcularXp())
             .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMissoesAtivas() {
        return missoesAtivas;
    }

    public void setMissoesAtivas(Set<Conteudo> missoesAtivas) {
        this.missoesAtivas = missoesAtivas;
    }

    public Set<Conteudo> getMissoesConcluidas() {
        return missoesConcluidas;
    }

    public void setMissoesConcluidas(Set<Conteudo> missoesConcluidas) {
        this.missoesConcluidas = missoesConcluidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem personagem = (Personagem) o; 
        return Objects.equals(nome, personagem.nome) && 
               Objects.equals(missoesAtivas, personagem.missoesAtivas) && 
               Objects.equals(missoesConcluidas, personagem.missoesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, missoesAtivas, missoesConcluidas);
    }
}