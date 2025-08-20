package calculadora;

public class Calculadora {
 
    public Double numeroA;
    public Double numeroB;

    public void somar(){
        Double resultadoSoma = numeroA + numeroB;
        System.out.println(numeroA +" + " + this.numeroB + " = " + resultadoSoma);
    }

}
