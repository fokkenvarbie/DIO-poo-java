package br.com.dio.desafio;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Jogo;
import br.com.dio.desafio.dominio.Missao;
import br.com.dio.desafio.dominio.Personagem;
import br.com.dio.desafio.dominio.Evento;

public class main {
    
    public static void main(String[] args) {
        
        Missao missao1 = new Missao();
        missao1.setTitulo("Missão Principal: O Encontro");
        missao1.setDescricao("Rastreie seu rival até o covil escondido.");
        missao1.setTotalAtividades(8);

        Missao missao2 = new Missao();
        missao2.setTitulo("Missão Secundária: O Julgamento");
        missao2.setDescricao("Reúna evidências.");
        missao2.setTotalAtividades(4);

        Evento evento = new Evento();
        evento.setTitulo("Evento Especial: Visão do Clero");
        evento.setDescricao("Receba insights sobre a caçada.");
        evento.setData(LocalDate.now());

        Jogo jogo = new Jogo();
        jogo.setNome("Malleus Maleficarum");
        jogo.setDescricao("RPG inspirado na época da Inquisição e a luta contra a bruxaria");
        
        jogo.getConteudos().add(missao1);
        jogo.getConteudos().add(missao2);
        jogo.getConteudos().add(evento);

        Personagem playerMaria = new Personagem();
        playerMaria.setNome("Maria, A Bruxa");
        
        playerMaria.iniciarJogo(jogo); 
        
        System.out.println("Missões Ativas de " + playerMaria.getNome() + playerMaria.getMissoesAtivas());
        playerMaria.progredir();
        playerMaria.progredir();
        System.out.println("------"); 
        System.out.println("Missões Ativas de " + playerMaria.getNome() + playerMaria.getMissoesAtivas());
        System.out.println("Missões Concluídas de " + playerMaria.getNome() + playerMaria.getMissoesConcluidas());
        System.out.println("XP Total:" + playerMaria.calcularScoreTotal());

        System.out.println("------------");

        Personagem playerJoao = new Personagem();
        playerJoao.setNome("João, O Inquisitor"); 
        playerJoao.iniciarJogo(jogo);

        System.out.println("Missões Ativas de " + playerJoao.getNome() + playerJoao.getMissoesAtivas());
        playerJoao.progredir();
        playerJoao.progredir();
        playerJoao.progredir();
        System.out.println("------");
        System.out.println("Missões Ativas de " + playerJoao.getNome() + playerJoao.getMissoesAtivas());
        System.out.println("Missões Concluídas de " + playerJoao.getNome() + playerJoao.getMissoesConcluidas());
        System.out.println("XP Total:" + playerJoao.calcularScoreTotal());
    }
}