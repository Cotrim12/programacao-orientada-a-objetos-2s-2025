package atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getssdOcupado() > computador.getssd()) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
            return false;
        }

        if (p.getmemoriaRamAlocada() > computador.getmemoriaram()) {
            System.out.println("Erro na execução do programa: memória RAM insuficiente.");
            return false;
        }

        System.out.println("Programa executado com sucesso!");

        float desempenho = computador.getOPS() * computador.getnucleos();
        float tempoExecucao = (float) p.getqO() / desempenho;

        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}
