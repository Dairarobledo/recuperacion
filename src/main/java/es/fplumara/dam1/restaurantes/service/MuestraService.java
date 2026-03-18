package es.fplumara.dam1.restaurantes.service;

import es.fplumara.dam1.restaurantes.model.Alergeno;
import es.fplumara.dam1.restaurantes.model.Degustacion;
import es.fplumara.dam1.restaurantes.model.ElementoCarta;
import es.fplumara.dam1.restaurantes.model.PlatoEstrella;

import java.util.List;
import java.util.Set;

public interface MuestraService {
    void altaElemento(ElementoCarta elemento);

void anotarDegustacion(Degustacion degustacion);

List<PlatoEstrella> recomendaciones();

Set<String> restaurantes();

List<ElementoCarta> productosConAlergenoDeRestaurante(String restaurante, Alergeno alergeno);
}
