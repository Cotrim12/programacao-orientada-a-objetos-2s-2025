public class Simulacao {
    public static void main(String[] args) {
        Carro marea = new Carro();
        marea.velocidade = 0;
        marea.placa = "CTR12J8";
        marea.modelo = "Weekend";
        marea.Ano = 98;

        Radar radar = new Radar();
        radar.modelo = "pardal";
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistao Sul";

        marea.acelerar(); // 10
        marea.acelerar(); // 20
        marea.acelerar(); // 30
        marea.acelerar(); // 40
        marea.acelerar(); // 50
        marea.acelerar(); // 60
        marea.acelerar(); // 70
        marea.acelerar(); // 80

        radar.avaliarVelocidade(marea);

        marea.acelerar(); //70
        radar.avaliarVelocidade(marea);

        marea.frear();
        radar.avaliarVelocidade(marea);
       
        


    }
}
