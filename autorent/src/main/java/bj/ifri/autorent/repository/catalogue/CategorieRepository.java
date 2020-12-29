package bj.ifri.autorent.repository.catalogue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.ifri.autorent.models.catalogue.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
