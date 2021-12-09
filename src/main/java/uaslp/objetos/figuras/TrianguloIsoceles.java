package uaslp.objetos.figuras;

public class TrianguloIsoceles extends Triangulo implements Figura, DrawableItem{
    @Override
    public String getName() {
        return "Triangulo Isoceles";
    }

    public String getDescription() {
        return "2 Lados iguales y 1 diferente";
    }
}
