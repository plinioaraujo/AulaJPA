package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
			
		//Pessoa p = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		
		if (em.find(Pessoa.class,3) != null) {
			
			System.out.println(em.find(Pessoa.class,1));
		} else{
			System.out.println("Não há registros!");
		}
		em.close();
		emf.close();

	}

}
