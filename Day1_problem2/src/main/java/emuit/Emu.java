package emuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emu {
    private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("acc");
    public static EntityManager provide(){
        return emf.createEntityManager();
    }
}
