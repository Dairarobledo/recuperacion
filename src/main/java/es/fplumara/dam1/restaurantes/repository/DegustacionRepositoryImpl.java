package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.Degustacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DegustacionRepositoryImpl implements DegustacionRepository{
   private Map<String, Degustacion> datos;

    public DegustacionRepositoryImpl() {
        this.datos = new HashMap<>();
    }

    @Override
    public void alta(Degustacion degustacion) {
        datos.put(degustacion.getId(), degustacion);
    }

    @Override
    public boolean yaExiste(String id) {
        return false;
    }

    @Override
    public List<Degustacion> obtenerTodas() {
        return datos.values().stream().toList();
    }

    @Override
    public Optional<Degustacion> buscarPorId(String id) {
        return Optional.empty();
    }

    @Override
    public List<Degustacion> buscarPorMesa(String idMesa) {
        return List.of();
    }

    @Override
    public List<Degustacion> buscarPorElemento(String codigoElemento) {
        return List.of();
    }

    @Override
    public boolean existeDegustacionDeMesaParaElemento(String idMesa, String codigoElemento) {
        return false;
    }

}
