package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro opala = new Carro("ACLR300", 0, 76, "Comodoro");
        opala.ano = 76;
        opala.modelo = "Comodoro";
        opala.placa = "ACLR300";
        opala.velociadade = 0;

        Radar radar = new Radar("Pistão Sul", 60 );
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistão Sul";

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70
        opala.setVelocidade(-60);
        radar.avaliarVelocidade(opala);

        opala.frear(); // 60

        radar.avaliarVelocidade(opala);
    }
}