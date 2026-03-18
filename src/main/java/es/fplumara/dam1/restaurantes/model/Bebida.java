package es.fplumara.dam1.restaurantes.model;

public class Bebida extends ElementoCarta{
    private boolean alcholica;
    private int volumenMl;

    public Bebida(String codigo, String nombre, String resturante, double precioBase, boolean alcholica, int volumenMl) {
        super(codigo, nombre, resturante, precioBase);
        this.alcholica = alcholica;
        this.volumenMl = volumenMl;
    }

    public boolean isAlcholica() {
        return alcholica;
    }

    public int getVolumenMl() {
        return volumenMl;
    }
    public String getTipo(){

    }
}
