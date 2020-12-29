package bj.ifri.autorent.service.utilisateur.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import bj.ifri.autorent.models.utilisateur.Utilisateur;
import bj.ifri.autorent.repository.utilisateur.UtilisateurRepository;
import bj.ifri.autorent.service.utilisateur.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	private UtilisateurRepository utilisateurRepository;
	
	public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository=utilisateurRepository;
	}
	
	@Override
	public Utilisateur create(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		Utilisateur utilisateurInDB = utilisateurRepository.getOne(id);
		if(utilisateurInDB != null) {
			utilisateurRepository.delete(utilisateurInDB);
		}else throw new RuntimeException("Cet utilisateur n'existe pas");
	}

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> findById(Long id) {
		return utilisateurRepository.findById(id);
	}

	@Override
	public Utilisateur rechercherParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

}
