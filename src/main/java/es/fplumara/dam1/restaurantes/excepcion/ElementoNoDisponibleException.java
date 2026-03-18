package es.fplumara.dam1.restaurantes.excepcion;

public class ElementoNoDisponibleException extends RuntimeException {
    public ElementoNoDisponibleException(String message) {
        super(message);
    }
}
