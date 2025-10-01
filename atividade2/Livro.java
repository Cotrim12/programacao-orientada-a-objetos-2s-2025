public class Livro extends Material {
    private String Edicao;

    public Livro(String Titulo, Integer anoPublicacao, String Edicao) {
        super(Titulo, anoPublicacao);
        this.Edicao = Edicao;
    }

    public void Descricao() {
        System.out.println("Livro: " + titulo + ", Ano: " + anoPublicacao + ", Edição: " + edicao);
    }
}