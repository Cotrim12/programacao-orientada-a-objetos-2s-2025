public class Revista extends Material {
    private String Autor;

    public Revista(String Titulo, Integer anoPublicacao, String Autor) {
        super(Titulo, anoPublicacao);
        this.Autor = Autor;
    }

    public void descricao() {
        System.out.println("Revista: " + Titulo + ", Ano: " + anoPublicacao + ", Autor: " + Autor);
    }
}