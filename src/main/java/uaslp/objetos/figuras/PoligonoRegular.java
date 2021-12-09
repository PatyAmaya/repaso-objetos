package uaslp.objetos.figuras;

public class PoligonoRegular{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados=numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        double perimetro = lado*numeroDeLados;
        double anguloCentral =360.0/numeroDeLados;
        double tangente=Math.tan(Math.toRadians(anguloCentral)/2);
        double apotema=(lado/2)/tangente;

        return (perimetro*apotema)/2;
    }
}
