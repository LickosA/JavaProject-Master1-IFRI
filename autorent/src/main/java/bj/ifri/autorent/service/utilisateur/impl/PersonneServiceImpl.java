package bj.ifri.autorent.service.utilisateur.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import bj.ifri.autorent.models.utilisateur.Personne;
import bj.ifri.autorent.repository.utilisateur.PersonneRepository;
import bj.ifri.autorent.service.utilisateur.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService{
private PersonneRepository personneRepository;
	
	public PersonneServiceImpl(PersonneRepository personneRepository) {
		this.personneRepository=personneRepository;
	}

	@Override
	public Personne create(Personne personne) {
		return personneRepository.save(personne);
	}

	@Override
	public void delete(Long id) {
		Personne personneInDB = personneRepository.getOne(id);
		if(personneInDB != null) {
			personneRepository.delete(personneInDB);
		}else throw new RuntimeException("Cette personne n'existe pas");
	}

	@Override
	public List<Personne> findAll() {
		return personneRepository.findAll();
	}

	@Override
	public Optional<Personne> findById(Long id) {
		return personneRepository.findById(id);
	}

	@Override
	public Personne rechercherParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne update(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

}
