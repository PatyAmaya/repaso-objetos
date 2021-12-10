package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura, DrawableItem{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLadosException{
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLadosException("Número de lados válido a partir de 5");
        }
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

    public double getArea()  {

        double perimetro = lado*numeroDeLados;
        double anguloCentral =360.0/numeroDeLados;
        double tangente=Math.tan(Math.toRadians(anguloCentral)/2);
        double apotema=(lado/2)/tangente;

        return (perimetro*apotema)/2;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
