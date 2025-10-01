public class Funcionario extends Pessoa {
    private String Cargo;

    public Funcionario(String Nome, String Email, String Cargo) {
        super(Nome, Email);
        this.Cargo = Cargo;
    }

    public void exibirInfo(){
        System.out.println("Funcionario: " + Nome + ",Email :" + Email + ", Cargo: " + Cargo);
    }
}