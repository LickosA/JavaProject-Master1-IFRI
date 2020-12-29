package bj.ifri.autorent.service.catalogue;

import java.util.List;
import java.util.Optional;

import bj.ifri.autorent.models.catalogue.Categorie;

public interface CategorieService {
	Categorie create(Categorie categorie);
	void delete(Long id);
	List<Categorie> findAll();
	Optional<Categorie> findById(Long id);
	Categorie rechercherParMotCle(String motCle);
	Categorie update(Categorie categorie);
	
}
