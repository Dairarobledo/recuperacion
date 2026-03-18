package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Principal extends PlatoComida implements Alergenico{
    private String guarnicion;
    private Set<Alergeno> alergenos;

    public Principal(String guarnicion, Set<Alergeno> alergenos) {
        super();
        this.guarnicion = guarnicion;
        this.alergenos = alergenos;
    }

    public String getGuarnicion() {
        return guarnicion;
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

        return "";
    }
}
