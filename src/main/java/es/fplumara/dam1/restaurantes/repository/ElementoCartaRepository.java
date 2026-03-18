package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.Degustacion;
import es.fplumara.dam1.restaurantes.model.ElementoCarta;

import java.util.List;
import java.util.Optional;

public interface ElementoCartaRepository {
    void alta(ElementoCarta elemento);
    boolean yaExiste(String codigo);
    List<ElementoCarta> obtenerTodos();
    Optional<ElementoCarta> buscarPorCodiago(String codigo);
    List<ElementoCarta> buscarPorRestaurante(String restaurante);
}
