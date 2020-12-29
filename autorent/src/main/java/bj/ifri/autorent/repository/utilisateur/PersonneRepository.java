package bj.ifri.autorent.repository.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.autorent.models.utilisateur.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
