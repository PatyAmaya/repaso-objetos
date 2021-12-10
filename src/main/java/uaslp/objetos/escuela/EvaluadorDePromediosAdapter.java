package uaslp.objetos.escuela;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    EvaluadorDePromedios evaluadorDePromedios;
    List<Double> calificacionesDouble = new LinkedList<>();

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios=evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {

        String[] calificacionesString= listaDeCalificaciones.split(",");
        for (String calificacion : calificacionesString){
            double cal= Double.parseDouble(calificacion);
            calificacionesDouble.add(cal);
        }
        return evaluadorDePromedios.evalua(calificacionesDouble);

    }
}
