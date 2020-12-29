package bj.ifri.autorent.repository.catalogue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.autorent.models.catalogue.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
