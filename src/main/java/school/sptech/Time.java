package school.sptech;

public class Time {
    String nome;
    Integer vitorias;
    Integer empates;
    Integer derrotas;

    public Time(){
        this.nome = "";
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    void registrarVitoria() {
        this.vitorias += 1;
    }

    void registrarEmpate() {
        this.empates += 1;
    }

    void registrarDerrota() {
        this.derrotas += 1;
    }

    Integer getPontos() {
        return ((this.vitorias * 3) + this.empates);
    }

    Integer getTotalPartidas() {
        return (this.vitorias + this.empates + this.derrotas);
    }

    Integer getAproveitamento() {
        double totalPartidas = this.vitorias + this.empates + this.derrotas;
        double aproveitamento = (this.vitorias / totalPartidas) * 100;

        return (int)aproveitamento;
    }

    void compararAproveitamento(Time adversario) {
        double aproveitamentoTimeCasa = this.getAproveitamento();
        double aproveitamentoTimeAdversario = adversario.getAproveitamento();

        if (aproveitamentoTimeCasa > aproveitamentoTimeAdversario) {
            System.out.println("O aproveitamento do time casa é maior!");
        }

        if (aproveitamentoTimeAdversario > aproveitamentoTimeCasa) {
            System.out.println("O aproveitamento do time adversário é maior!");
        }

        if (aproveitamentoTimeCasa == aproveitamentoTimeAdversario) {
            System.out.println("Empate no aproveitamento!");
        }
    }

    void exibirInformações() {
        System.out.println("Time: " + this.nome);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("---");
        System.out.println("Pontos: " + this.getPontos());
        System.out.println("Total de Partidas: " + (this.vitorias + this.empates + this.derrotas));
        System.out.println("Aproveitamento: " + this.getAproveitamento() + "%");
    }
}

