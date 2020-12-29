package bj.ifri.autorent.service.catalogue;

import java.util.List;
import java.util.Optional;

import bj.ifri.autorent.models.catalogue.Location;

public interface LocationService {
	Location create(Location location);
	void delete(Long id);
	List<Location> findAll();
	Optional<Location> findById(Long id);
	Location rechercherParMotCle(String motCle);
	Location update(Location location);
	
}
