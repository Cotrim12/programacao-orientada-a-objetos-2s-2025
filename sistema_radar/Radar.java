package sistema_radar;

public class Radar {
    public int limiteVelocidade;
    public String localizacao;

    public Radar(String localizacao, Integer limiteVelocidade){
          this.localizacao = localizacao;
          this.limiteVelocidade = limiteVelocidade;
    }

    public Radar(Integer limiteVelocidade){
        this.limiteVelocidade = limiteVelocidade;
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+ velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);
    }
}