package bj.ifri.autorent.models.catalogue;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Length;

import bj.ifri.autorent.models.utilisateur.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Voiture implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 6961511602962135451L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Length(max = 30, message = "Ne doit pas dépasser 30 caractères")
	private String marque;
	@Length(max = 30, message = "Ne doit pas dépasser 30 caractères")
	private String modele;
	@Length(max = 4, message = "L'année ne doit pas dépasser 4 caractères")
	private int annee;
	@Length(max = 30, message = "Ne doit pas dépasser 30 caractères")
	private String transmission;
	@Length(max = 30, message = "Ne doit pas dépasser 30 caractères")
	private int nombreDePlace;
	private double prixJournalier;
	private String image;
	private Boolean statut;
	
	//relation ManyToOne entre utilisateur et voiture, donnant location
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false)
	private Utilisateur utilisateur;
	
	//relation ManyToOne entre voiture et categorie
	@ManyToOne
	@JoinColumn(name = "categorie_id", nullable = false)
	private Categorie categorie;
}
