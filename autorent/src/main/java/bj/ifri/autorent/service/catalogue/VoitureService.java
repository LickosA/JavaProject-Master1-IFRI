package bj.ifri.autorent.service.catalogue;

import java.util.List;
import java.util.Optional;

import bj.ifri.autorent.models.catalogue.Voiture;

public interface VoitureService {
	Voiture create(Voiture voiture);
	void delete(Long id);
	List<Voiture> findAll();
	Optional<Voiture> findById(Long id);
	Voiture rechercherParMotCle(String motCle);
	Voiture update(Voiture voiture);
	
}
