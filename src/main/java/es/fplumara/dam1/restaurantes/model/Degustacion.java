package es.fplumara.dam1.restaurantes.model;

public class Degustacion {
    private String id;
    private String isMesa;
    private String codigoElemento;
    private int unidades;
    private double valoracion;

    public Degustacion(String id, String isMesa, String codigoElemento, int unidades, double valoracion) {
        this.id = id;
        this.isMesa = isMesa;
        this.codigoElemento = codigoElemento;
        this.unidades = unidades;
        this.valoracion = valoracion;
    }

    public String getId() {
        return id;
    }

    public String getIsMesa() {
        return isMesa;
    }

    public String getCodigoElemento() {
        return codigoElemento;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getValoracion() {
        return valoracion;
    }

    public double getPuntuacionBase(){
        if(unidades < 1 || unidades >6){
            throw new IllegalArgumentException("las unidades deben ser entre 1 y 6");
        }
        if(valoracion <1.0 || valoracion > 5.0){
            throw new IllegalArgumentException("la valoracion debe estar entre 1.0 y 5.0");
        }
        return unidades*valoracion;
    }
}
