package bj.ifri.autorent.models.catalogue;

import java.io.Serializable;
import java.sql.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

//import bj.ifri.autorent.models.utilisateur.Personne;
import bj.ifri.autorent.models.utilisateur.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Location implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -5133817020604983557L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(pattern = "dd-MM-yyyy")
    private Date jourEmprunt;
	@JsonFormat(pattern = "dd-MM-yyyy")
    private Date jourRetour;
	private double soldeLocation;
	
	//relation ManyToOne entre Location et utilisateur
	@ManyToOne
	@JoinColumn(name = "utilisateur_id", nullable = false)
	private Utilisateur utilisateur;
	
}
