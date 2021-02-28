package Model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Produit implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@Column (name="idProduit")
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private int idProduit;

	private String nomProduit;

	private double prixProduit;
	private int idFournisseur;
	public Produit(  String nomProduit, double prixProduit,int idFournisseur) {
		super();
		
	
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.idFournisseur = idFournisseur;
	}

	public Produit() {
	}

	public int getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return this.nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrixProduit() {
		return this.prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", idFournisseur=" + idFournisseur + "]";
	}

}