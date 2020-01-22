package fr.scholanova.eial.archidist.PresentationEjbInterface;

import java.io.Serializable;

/**
 * @author Livio
 *
 */
public class Repas implements Serializable {
    private String nom;
    private Double prix;
    private Boolean dehors;
    
    public Repas(String string, double d, boolean b) {
        // TODO Auto-generated constructor stub
    	super();
        nom = string;
        prix = d;
        dehors = b;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Boolean getDehors() {
		return dehors;
	}

	public void setDehors(Boolean dehors) {
		this.dehors = dehors;
	}
}
