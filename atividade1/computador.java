package atividade1;

public class computador {

    private Integer memoriaram;
    private Integer ssd;
    private Integer nucleos;
    private float oPS;
    
    private computador(Integer memoriaram, Integer ssd, Integer nucleos, float oPS){
        this.memoriaram = memoriaram;
        this.ssd = ssd;
        this.nucleos = nucleos;
        this.oPS = oPS;

    }

    public Integer getmemoriaram(){
        return memoriaram;
    }

    public void setmemoriaram(Integer memoriaram) {
        this.memoriaram = memoriaram;
    }

    public Integer getssd(){
        return ssd;
    }

    public void setssd(Integer ssd) {
        this.ssd = ssd;
    }

    public Integer getnucleos(){
        return nucleos;
    }

    public void setnucleos(Integer nucleos){
        this.nucleos = nucleos;

    }

    public float getoPS(){
        return oPS;
    }

    public void setoPS(float oPS) {
        this.oPS = oPS;
    }
}
