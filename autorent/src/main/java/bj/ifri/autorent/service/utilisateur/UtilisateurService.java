package bj.ifri.autorent.service.utilisateur;

import java.util.List;
//import com.sun.tools.javac.util.List;
import java.util.Optional;

import bj.ifri.autorent.models.utilisateur.Utilisateur;

public interface UtilisateurService {
	Utilisateur create(Utilisateur utilisateur);
	void delete(Long id);
	List<Utilisateur> findAll();
	Optional<Utilisateur> findById(Long id);
	Utilisateur rechercherParMotCle(String motCle);
	Utilisateur update(Utilisateur utilisateur);
}
