package uaslp.objetos.escuela;

import java.util.LinkedList;
import java.util.List;

public class SalaDeJuntasFactory {

    public static SalaDeJuntas get(String s){
        List<SalaDeJuntas> salaDeJuntasList = new LinkedList<>();
        for (SalaDeJuntas salaDeJuntas : salaDeJuntasList) {
            if (salaDeJuntas.getNombre() == s) {
                return salaDeJuntas;
            }
        }
        SalaDeJuntas salaDeJuntas = new SalaDeJuntas(s);
        salaDeJuntasList.add(salaDeJuntas);
        return salaDeJuntas;
    }
}
