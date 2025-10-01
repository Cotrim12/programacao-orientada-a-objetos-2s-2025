public abstract class Pessoa {
    protected String Nome;
    protected String Email;

    public Pessoa(String Nome , String Email){
    this.Nome = Nome;
    this.Email = Email;
}

public abstract void exibirInfo();
}