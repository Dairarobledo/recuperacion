package es.fplumara.dam1.restaurantes.model;

public abstract class ElementoCarta {
    private String codigo;
    private String nombre;
    private String resturante;
    private double precioBase;

    public ElementoCarta(String codigo, String nombre, String resturante, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.resturante = resturante;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResturante() {
        return resturante;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTipo(){

        return "";
    }
}
