package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public interface Alergenico<E extends Alergeno> {
    default Set<E> getAlergenos(){

    }

    boolean contieneAlergeno(E alergeno);
}
