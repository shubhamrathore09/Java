package UseCaseClass;

import dao.ShipMentDao;
import dao.ShipmentDaoImpl;

import java.util.Scanner;

public class UpdateShipMentById {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter shipment id");
        int id=sc.nextInt();
        System.out.println("please enter shipment content");
        String con= sc.next();
        System.out.println("please enter shipment reciver address");
        String rec=sc.next();
        System.out.println("please enter shipment wight");
        double w=sc.nextDouble();
        ShipMentDao dao =new ShipmentDaoImpl();
        System.out.println(dao.updateShipmentById(id,con,w,rec));
        //that code help you to take input from user
    }
    public static void main(String[] args) {
        ShipMentDao dao =new ShipmentDaoImpl();
        System.out.println(dao.updateShipmentById(2,"laptop",3.2,"dewash"));
//        InputByScanner();
    }
}
