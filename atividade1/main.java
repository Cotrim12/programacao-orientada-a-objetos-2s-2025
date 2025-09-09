public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador(16, 500, 4, 2.5f);
        SistemaOperacional so = new SistemaOperacional(comp);

        Programa progSucesso = new Programa(8, 200, 1000);
        Programa progErroSSD = new Programa(8, 600, 1000); // SSD ocupado maior que disponível
        Programa progErroRAM = new Programa(20, 200, 1000); // RAM alocada maior que disponível

        System.out.println("\nTeste de execução com sucesso:");
        so.executarPrograma(progSucesso, true);

        System.out.println("\nTeste de falha na instalação (SSD):");
        so.executarPrograma(progErroSSD, true);

        System.out.println("\nTeste de falha na execução (RAM):");
        so.executarPrograma(progErroRAM, true);
    }
}