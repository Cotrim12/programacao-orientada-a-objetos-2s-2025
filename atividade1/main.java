package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f);
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(8, 200, 2, 5000);   // Deve rodar com sucesso
        Programa p2 = new Programa(20, 200, 2, 5000);  // Erro de RAM
        Programa p3 = new Programa(8, 600, 2, 5000);   // Erro de SSD

        so.executarPrograma(p1);
        so.executarPrograma(p2);
        so.executarPrograma(p3);
    }
}
