package bj.ifri.autorent.models.utilisateur;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Length;

//import com.sun.tools.javac.util.List;

import bj.ifri.autorent.models.catalogue.Location;
import bj.ifri.autorent.models.catalogue.Voiture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4505873359201370461L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Length(max = 20, message = "Le LOGIN ne doit pas dépasser 20 caractères")
	@Column(unique = true, nullable = false)
	private String login;
	@Length(max = 128, message = "Le MOT DE PASSE ne doit pas dépasser 128 caractères" )
	private String motDePasse;
	private Boolean role;//1 = admin, 0 = client
	
	//relation OneToOne entre utilisateur et personne
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personne_id")
	private Personne personne;
	
	//relation OneToMany entre utilisateur et location
	@OneToMany(mappedBy = "utilisateur")
	private List<Location> locations = new ArrayList<>();
	
	//relation OneToMany entre utilisateur et voiture, devant donné la table d'association Location
	@OneToMany(mappedBy = "utilisateur")
	private List<Voiture> voitures = new ArrayList<>();
}
