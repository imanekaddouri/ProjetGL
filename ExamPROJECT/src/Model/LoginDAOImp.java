package Model;

import javax.persistence.EntityManager;



public abstract class LoginDAOImp implements LoginDAO {
	private EntityManager entityManager=JPA.getEntityManager("DemoJPA");
	

   public Login findusername(String username) {
		return entityManager.find(Login.class, username);
	}
   public Login findpassword(String password) {
		return entityManager.find(Login.class, password);
	}

}