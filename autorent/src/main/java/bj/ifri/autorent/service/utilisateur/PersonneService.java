package bj.ifri.autorent.service.utilisateur;

import java.util.List;
import java.util.Optional;

import bj.ifri.autorent.models.utilisateur.Personne;

public interface PersonneService {
	Personne create(Personne personne);
	void delete(Long id);
	List<Personne> findAll();
	Optional<Personne> findById(Long id);
	Personne rechercherParMotCle(String motCle);
	Personne update(Personne personne);
}
