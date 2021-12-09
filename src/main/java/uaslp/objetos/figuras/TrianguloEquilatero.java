package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo implements Figura, DrawableItem{
    @Override
    public String getName() {
        return "Triangulo Equilatero";
    }

    public String getDescription() {
        return "Lados iguales";
    }

}
