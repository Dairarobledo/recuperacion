package es.fplumara.dam1.restaurantes.service;

import es.fplumara.dam1.restaurantes.model.Alergeno;
import es.fplumara.dam1.restaurantes.model.Degustacion;
import es.fplumara.dam1.restaurantes.model.ElementoCarta;
import es.fplumara.dam1.restaurantes.model.PlatoEstrella;
import es.fplumara.dam1.restaurantes.repository.DegustacionRepository;
import es.fplumara.dam1.restaurantes.repository.ElementoCartaRepository;

import java.util.List;
import java.util.Set;

public class MuestraServiceImpl implements MuestraService{
    private ElementoCartaRepository elementoReposito;
    private DegustacionRepository degustacionRepo;

    @Override
    public void altaElemento(ElementoCarta elemento) {
        if( elemento == null){
            throw new IllegalArgumentException(" elemnto null");
        }
    }

    @Override
    public void anotarDegustacion(Degustacion degustacion) {
        if(degustacion == null){
            throw new IllegalArgumentException("no puede ser null");
        }

    }

    @Override
    public List<PlatoEstrella> recomendaciones() {
        return List.of();
    }

    @Override
    public Set<String> restaurantes() {
        return Set.of();
    }

    @Override
    public List<ElementoCarta> productosConAlergenoDeRestaurante(String restaurante, Alergeno alergeno) {
        return List.of();
    }
}
