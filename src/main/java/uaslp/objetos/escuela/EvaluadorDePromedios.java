package uaslp.objetos.escuela;

import java.util.List;

public class EvaluadorDePromedios {

    public double evalua(List<Double> calificaciones){
        return (calificaciones.stream().reduce(0.0, Double::sum) / calificaciones.size());
    }
}
