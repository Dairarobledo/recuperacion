package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Postre extends ElementoCarta implements Alergenico{
    private boolean servidoFrio;
    private Set<Alergeno> alergenos;

    public Postre(String codigo, String nombre, String resturante, double precioBase, boolean servidoFrio, Set<Alergeno> alergenos) {
        super(codigo, nombre, resturante, precioBase);
        this.servidoFrio = servidoFrio;
        this.alergenos = alergenos;
    }

    public boolean isServidoFrio() {
        return servidoFrio;
    }

    @Override
    public Set<Alergeno> getAlergenos() {
        return alergenos;
    }

    @Override
    public boolean contieneAlergeno(Alergeno alergeno) {
        return false;
    }
    public String getTipo(){

    }
}
