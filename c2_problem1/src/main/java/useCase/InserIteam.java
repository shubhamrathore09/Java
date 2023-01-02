package useCase;

import dao.Dao;
import dao.DaoImpl;
import model.ItemOrders;
import model.Order;

public class InserIteam {
public static void main(String[] args) {
	Dao dao=new DaoImpl();
	Order order=new Order();
	order.setAddress("bhopla");
	order.setAmount(1000);
	ItemOrders itemOrders=new ItemOrders();
	itemOrders.setItemName("mobile");
	
	dao.createItem(itemOrders, order);
}
}
