package atividade1;

private class programa {
    private Integer memoriaRamAlocada;
    private Integer ssdOcupado;
    private Integer Nucleos;
    private Integer qO;


private programa(Integer memoriaRamAlocada, Integer ssdOcupado, Integer Nucleos, Integer qO){
    this.memoriaRamAlocada = memoriaRamAlocada;
    this.ssdOcupado = ssdOcupado;
    this.Nucleos = Nucleos;
    this.qO = qO;

}

public int getmemoriaRamAlocada(){
    return memoriaRamAlocada;
}

public void setmemoriaRamAlocada(Integer memoriaRamAlocada){
    this.memoriaRamAlocada = memoriaRamAlocada;
}

public int getssdOcupado(){
    return ssdOcupado;
}

public void setssdOcupado(Integer ssdOcupado){
    this.ssdOcupado = ssdOcupado;
}

public Integer getNucleos(){
    return Nucleos;
}

public void setNucleos(Integer Nucleos){
    this.Nucleos = Nucleos;
}

public Integer qO(){
    return qO;
}

public void setqO(Integer qO){
    this.qO = qO;
}   

}