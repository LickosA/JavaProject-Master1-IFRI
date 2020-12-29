package bj.ifri.autorent.models.utilisateur;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7947866602973245878L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Length(max = 30, message = "Le nom ne doit pas dépasser 30 caractères")
	private String nom;
	@Length(max = 30, message = "Le prenom ne doit pas dépasser 30 caractères")
	private String prenom;
	@Length(max = 30, message = "L'email ne doit pas dépasser 30 caractères")
	@Column(unique = true, nullable = false)
	private String email;
	@Length(max = 30, message = "Le numéro de téléphone ne doit pas dépasser 30 caractères")
	@Column(unique = true, nullable = true)
	private String telephone;
	private double solde;
	
	//relation OneToOne entre personne et utilisateur 
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "personne", fetch = FetchType.LAZY)
	private Utilisateur utilisateur;
}
