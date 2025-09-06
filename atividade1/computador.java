package atividade1;

public class Computador {
    private Integer memoriaram;
    private Integer ssd;
    private Integer nucleos;
    private float oPS;

    public Computador(Integer memoriaram, Integer ssd, Integer nucleos, float oPS) {
        this.memoriaram = memoriaram;
        this.ssd = ssd;
        this.nucleos = nucleos;
        this.oPS = oPS;
    }

    public Integer getmemoriaram(){ return memoriaram; }
    public void setmemoriaram(Integer memoriaram){ this.memoriaram = memoriaram; }

    public Integer getssd(){ return ssd; }
    public void setssd(Integer ssd){ this.ssd = ssd; }

    public Integer getnucleos(){ return nucleos; }
    public void setnucleos(Integer nucleos){ this.nucleos = nucleos; }

    public float getOPS(){ return oPS; }
    public void setOPS(float oPS){ this.oPS = oPS; }
}
