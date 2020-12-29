package bj.ifri.autorent.service.catalogue.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import bj.ifri.autorent.models.catalogue.Location;
import bj.ifri.autorent.repository.catalogue.LocationRepository;
import bj.ifri.autorent.service.catalogue.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	private LocationRepository locationRepository;
	
	public void LocationSimpleImpl(LocationRepository locationRepository) {
		this.locationRepository=locationRepository;
	}

	@Override
	public Location create(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void delete(Long id) {
		Location locationInDB = locationRepository.getOne(id);
		if(locationInDB != null) {
			locationRepository.delete(locationInDB);
		}else throw new RuntimeException("Cette location n'existe pas");	
	}

	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public Optional<Location> findById(Long id) {
		return locationRepository.findById(id);
	}

	@Override
	public Location rechercherParMotCle(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location update(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

}
