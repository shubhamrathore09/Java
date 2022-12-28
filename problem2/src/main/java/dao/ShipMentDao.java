package dao;

import shipMent.Shipment;

public interface ShipMentDao {
    public Shipment getShipmentById(int id);
    public String SaveShipment(Shipment shipment);
    public String DeleteShipmentById(int id);
    public String updateShipmentById(int id,String content,double weight,String reciverAddress);

}
