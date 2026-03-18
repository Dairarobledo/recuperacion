package es.fplumara.dam1.restaurantes.excepcion;

public class ElementoDuplicadoException extends RuntimeException {
    public ElementoDuplicadoException(String message) {
        super(message);
    }
}
