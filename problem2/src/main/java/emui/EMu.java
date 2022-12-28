package emui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMu {
    private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("acc");
    public static EntityManager provideConnection(){
        return emf.createEntityManager();
    }
}
