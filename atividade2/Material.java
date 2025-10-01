public abstract class Material {
    protected String titulo;
    protected Integer anoPublicacao;

    public Material(String titulo, Integer anoPublicacao) {
        this.Titulo = Titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void descricao();
}
