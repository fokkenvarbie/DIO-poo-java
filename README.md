<h1>Módulo de Gerenciamento de Progressão e XP</h1>

Este documento apresenta o escopo e a estrutura de classes de um projeto fictício chamado Malleus Maleficarum, sendo uma aplicação baseada em conceitos de Programação Orientada a Objetos (POO) em Java. O projeto simula o gerenciamento de progressão de jogadores em missões de um role-playing game sobre a época da Inquisição.
<br>

- **Arquitetura:**
  - **Conteudo:** Serve como base para as missões que um jogador precisa concluir para adquirir XP. Define os atributos comuns (titulo, descricao) e o método abstrato calcularXp() (Polimorfismo).
  - **Missao:** Herda de Conteudo. Representa uma missão principal ou secundária no jogo. O cálculo do XP é proporcional ao número de missões completas (totalAtividades).
  - **Evento:** Herda de Conteudo. Representa um evento de tempo limitado, com a adição de um atributo específico (data). O cálculo de XP (calcularXp()) adiciona um bônus fixo ao XP base.
  - **Personagem:** Representa o jogador. Possui nome e duas coleções (Set) para gerenciar seu progresso, sendo elas missoesAtivas, em que o personagem está engajado, e missoesConcluidas, que o personagem finalizou. Possui métodos essenciais como iniciarJogo(), progredir() (que move o Conteudo de ativo para concluído) e calcularScoreTotal().
  - **Jogo:** Representa a Campanha do jogo. Agrupa um conjunto de atividades (Missões e Eventos) e rastreia os personagens que estão participando.
