public class Usuario extends Pessoa {
    private Integer Matricula;

    public Usuario(String Nome, String Email, Integer Matricula) {
        super(Nome, Email);
        this.Matricula = Matricula;
    }

    public void exibirInfo(){
        System.out.println("Usuario: " + Nome + ", Email " + Email + ", Matricula: " + Matricula);
    }
}