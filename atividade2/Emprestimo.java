public class Emprestimo {
    private Pessoa Pessoa;
    private Material Material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa Pessoa, Material Material, String dataEmprestimo, String dataDevolucao) {
        this.Pessoa = Pessoa;
        this.Material = Material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataDevolucao);
        Pessoa.exibirInfo();
        Material.Descricao();
    }
}