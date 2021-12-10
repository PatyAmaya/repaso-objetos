package uaslp.objetos.figuras;

public class Cuadrado implements Figura, DrawableItem{
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() throws LadoNoProvistoException {
        if(lado==0.0){
            throw new LadoNoProvistoException();
        }
        return lado*lado;
    }

    @Override
    public String getName() {
        return "Cuadrado";
    }
}
