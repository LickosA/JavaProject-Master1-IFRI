package bj.ifri.autorent.service.catalogue.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import bj.ifri.autorent.models.catalogue.Voiture;
import bj.ifri.autorent.repository.catalogue.VoitureRepository;
import bj.ifri.autorent.service.catalogue.VoitureService;

@Service
public class VoitureServiceImpl implements VoitureService{
	private VoitureRepository voitureRepository;
	
	public void VoitureSimpleImpl(VoitureRepository voitureRepository) {
		this.voitureRepository=voitureRepository;
	}

	@Override
	public Voiture create(Voiture voiture) {
		return voitureRepository.save(voiture);
	}

	@Override
	public void delete(Long id) {
		Voiture voitureInDB = voitureRepository.getOne(id);
		if(voitureInDB != null) {
			voitureRepository.delete(voitureInDB);
		}else throw new RuntimeException("Cette voiture n'existe pas");
	}

	@Override
	public List<Voiture> findAll() {
		return voitureRepository.findAll();
	}

	@Override
	public Optional<Voiture> findById(Long id) {
		return voitureRepository.findById(id);
	}

	@Override
	public Voiture rechercherParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Voiture update(Voiture voiture) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
