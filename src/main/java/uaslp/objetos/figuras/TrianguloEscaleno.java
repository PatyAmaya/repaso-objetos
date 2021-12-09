package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo implements Figura, DrawableItem{

    @Override
    public String getName() {
        return "Triangulo Escaleno";
    }

    public String getDescription() {
        return "Lados diferentes";
    }
}
