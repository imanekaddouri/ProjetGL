package Model;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class ProduitDAOImp implements ProduitDAO {
	private EntityManager entityManager=JPA.getEntityManager("DemoJPA");
	@Override
	public Produit create(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(p);
	 	tx.commit();

		return p;
	}

	@Override
	public Produit select(int id) {
		return entityManager.find(Produit.class, id);
	}

	@Override
	public Produit update(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.merge(p);
	 	tx.commit();
		return p;
	}

	@Override
	public void delete(int id) {
		Produit produit = entityManager.find(Produit.class, id);
		 entityManager.getTransaction().begin();
		 entityManager.remove(produit);
		 entityManager.getTransaction().commit();

	}
	
	
	

}