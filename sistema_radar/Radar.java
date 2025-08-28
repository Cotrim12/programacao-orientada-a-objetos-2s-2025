package sistema_radar;

public class Radar {
    public int limiteVelocidade;
    public String localizacao;

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            // emitir notificação
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }

    public void emitirNotificacao(String placa, int velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+ velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);
    }
}