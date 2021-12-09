package uaslp.objetos.figuras;

public class Triangulo implements Figura, DrawableItem{
    private double base;
    private double altura;

    public Triangulo(){
    }

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base){
        this.base=base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return (base*altura)/2;
    }

    public String getDescription() {
        return "Cualquier triangulo";
    }

    @Override
    public String getName() {
        return "Triangulo";
    }
}
