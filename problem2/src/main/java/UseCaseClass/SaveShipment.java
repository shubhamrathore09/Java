package UseCaseClass;

import dao.ShipMentDao;
import dao.ShipmentDaoImpl;
import shipMent.Shipment;

import java.util.Scanner;

public class SaveShipment {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter shipment content");
        String con= sc.next();
        System.out.println("please enter shipment reciver address");
        String rec=sc.next();
        System.out.println("please enter shipment wight");
        double w=sc.nextDouble();
        System.out.println("please enter shipment packnumber");
        String pack=sc.next();
        System.out.println("please enter shipment sendereAddress");
        String sender=sc.next();

        ShipMentDao dao =new ShipmentDaoImpl();

        System.out.println(dao.SaveShipment(new Shipment(pack,con,w,sender,rec)));
        //that code help you to take input from user
    }
    public static void main(String[] args) {
        ShipMentDao dao =new ShipmentDaoImpl();
        System.out.println(dao.SaveShipment(new Shipment("B12","mobile",2.1,"bhopal","sehore")));
//        InputByScanner();

    }
}
