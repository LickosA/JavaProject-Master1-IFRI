package bj.ifri.autorent.service.catalogue.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import bj.ifri.autorent.models.catalogue.Categorie;
import bj.ifri.autorent.repository.catalogue.CategorieRepository;
import bj.ifri.autorent.service.catalogue.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService{
private CategorieRepository categorieRepository;
	
	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		this.categorieRepository=categorieRepository;
	}
	
	@Override
	public Categorie create(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public void delete(Long id) {
		Categorie categorieInDB = categorieRepository.getOne(id);
		if( categorieInDB != null) {
			categorieRepository.delete(categorieInDB);
		}else throw new RuntimeException("Cette categorie n'existe pas");
	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Optional<Categorie> findById(Long id) {
		return categorieRepository.findById(id);
	}

	@Override
	public Categorie rechercherParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie update(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

}
