package bj.ifri.autorent.models.catalogue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;

//import com.sun.tools.javac.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Categorie implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -5102115615652788468L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, nullable = false)
	@Length(max = 30, message = "Ne doit pas dépasser 30 caractères")
	private String libelle;
	
	//relation onetomany entre catégorie et voiture
	@OneToMany(mappedBy = "utilisateur")
	private List<Voiture> voitures = new ArrayList<>();
}
