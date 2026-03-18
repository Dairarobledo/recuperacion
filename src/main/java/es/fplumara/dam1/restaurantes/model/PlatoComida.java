package es.fplumara.dam1.restaurantes.model;

public abstract class PlatoComida {
    private int tiempoPreparacion;

    public PlatoComida(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }
}
