package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Entrante extends PlatoComida implements Alergenico{
    private boolean compartible;
    private Set<Alergeno> alergenos;

    public Entrante(int tiempoPreparacion) {
        super(tiempoPreparacion);
    }

    public boolean isCompartible() {
        return compartible;
    }

    @Override
    public Set<Alergeno> getAlergenos() {
        return alergenos;
    }

    @Override
    public boolean contieneAlergeno(Alergeno alergeno) {
        return false;
    }

}
