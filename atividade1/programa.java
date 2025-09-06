package atividade1;

public class Programa {
    private Integer memoriaRamAlocada;
    private Integer ssdOcupado;
    private Integer nucleos;
    private Integer qO;

    public Programa(Integer memoriaRamAlocada, Integer ssdOcupado, Integer nucleos, Integer qO) {
        this.memoriaRamAlocada = memoriaRamAlocada;
        this.ssdOcupado = ssdOcupado;
        this.nucleos = nucleos;
        this.qO = qO;
    }

    public int getmemoriaRamAlocada(){ return memoriaRamAlocada; }
    public void setmemoriaRamAlocada(Integer memoriaRamAlocada){ this.memoriaRamAlocada = memoriaRamAlocada; }

    public int getssdOcupado(){ return ssdOcupado; }
    public void setssdOcupado(Integer ssdOcupado){ this.ssdOcupado = ssdOcupado; }

    public Integer getNucleos(){ return nucleos; }
    public void setNucleos(Integer nucleos){ this.nucleos = nucleos; }

    public Integer getqO(){ return qO; }
    public void setqO(Integer qO){ this.qO = qO; }
}
