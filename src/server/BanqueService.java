package server;

import java.util.*;

public class BanqueService {

	public double conversion(double montant)
	{
		return montant*3.36;
	}
	public static void main(String[] args) {
		BanqueService bs = new BanqueService();
		System.out.print(bs.conversion(2500));
		
		
	}
	public Compte getCompte(int code) {
		return new Compte(code,0,new Date());
	}
	public List<Compte> getComptes(){
		List<Compte> Comptes = new ArrayList<Compte>();
		return Comptes;
	}
	
	class Compte {
		private int code;
		private double solde;
		private Date dateCreation;
		public Compte(int code, double solde, Date dateCreation) {
			this.code=code;
			this.solde=solde;
			this.dateCreation=dateCreation;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public double getSolde() {
			return solde;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		
		
	}

}