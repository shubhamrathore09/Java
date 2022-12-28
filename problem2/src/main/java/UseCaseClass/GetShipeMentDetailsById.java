package UseCaseClass;

import dao.ShipMentDao;
import dao.ShipmentDaoImpl;

import java.util.Scanner;

public class GetShipeMentDetailsById {
    public static void InputByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter shipment id");
        int id= sc.nextInt();
        ShipMentDao dao =new ShipmentDaoImpl();

        System.out.println(dao.getShipmentById(id));
        //that code help you to take input from user
    }
    public static void main(String[] args) {
        ShipMentDao dao =new ShipmentDaoImpl();
        System.out.println(dao.getShipmentById(1));
//        InputByScanner();
    }
}
