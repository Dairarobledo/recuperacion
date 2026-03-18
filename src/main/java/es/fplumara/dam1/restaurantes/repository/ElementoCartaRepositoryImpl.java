package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.ElementoCarta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ElementoCartaRepositoryImpl implements ElementoCartaRepository{
    private Map<String, ElementoCarta> datos;

    public ElementoCartaRepositoryImpl() {
        this.datos = new HashMap<>();
    }

    @Override
    public void alta(ElementoCarta elemento) {
        datos.put(elemento.getCodigo(), elemento);
    }

    @Override
    public boolean yaExiste(String codigo) {
        return false;
    }

    @Override
    public List<ElementoCarta> obtenerTodos() {
        return datos.values().stream().toList();
    }

    @Override
    public Optional<ElementoCarta> buscarPorCodiago(String codigo) {
        return Optional.empty();
    }

    @Override
    public List<ElementoCarta> buscarPorRestaurante(String restaurante) {
        return List.of();
    }


}
