package es.fplumara.dam1.restaurantes.model;

public class PlatoEstrella {
    private String restaurante;
    private String codigoElemento;
    private String nombreElemento;
    private String tipoElemento;
    private double popularida;
    private int mesasDistintas;

    public PlatoEstrella(String restaurante, String codigoElemento, String nombreElemento, String tipoElemento, double popularida, int mesasDistintas) {
        this.restaurante = restaurante;
        this.codigoElemento = codigoElemento;
        this.nombreElemento = nombreElemento;
        this.tipoElemento = tipoElemento;
        this.popularida = popularida;
        this.mesasDistintas = mesasDistintas;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public String getCodigoElemento() {
        return codigoElemento;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public double getPopularida() {
        return popularida;
    }

    public int getMesasDistintas() {
        return mesasDistintas;
    }
}
