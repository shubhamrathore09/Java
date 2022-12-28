package dao;

import emui.EMu;
import shipMent.Shipment;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class ShipmentDaoImpl implements ShipMentDao{
    @Override
    public Shipment getShipmentById(int id) {
        EntityManager em= EMu.provideConnection();
        Shipment shipment=em.find(Shipment.class,id);

        return shipment;
    }

    @Override
    public String SaveShipment(Shipment shipment) {
        EntityManager em= EMu.provideConnection();
        em.getTransaction().begin();
        shipment.setLocalDateTime(LocalDateTime.now());
        em.persist(shipment);
        em.getTransaction().commit();
        em.close();
        return "shipment added succesfully";
    }

    @Override
    public String DeleteShipmentById(int id) {
        EntityManager em= EMu.provideConnection();
        Shipment shipment=em.find(Shipment.class,id);
        if(shipment==null){
            return "wrong id no shipment by that id";
        }
        em.getTransaction().begin();
        em.remove(shipment);
        em.getTransaction().commit();
        em.close();
        return "successfully delete shipment";
    }

    @Override
    public String updateShipmentById(int id,String content, double weight, String reciverAddress) {
        EntityManager em=EMu.provideConnection();
        Shipment shipment=em.find(Shipment.class,id);
        if(shipment==null){
            return "wrong id no shipment by that id";
        }
        else{
            em.getTransaction().begin();
            shipment.setContent(content);
            shipment.setReceiverAddress(reciverAddress);
            shipment.setWeight(weight);
            em.getTransaction().commit();
            em.close();
            return "succesfull shipment address update";
        }

    }
}
