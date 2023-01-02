package useCase;

import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import dao.DaoImpl;
import model.ItemOrders;
import model.Order;

public class InserList {
public static void main(String[] args) {
	
	Dao dao=new  DaoImpl();
	List<ItemOrders>list=new ArrayList<ItemOrders>();
	list.add(new ItemOrders("laptop"));
	list.add(new ItemOrders("mobile"));
	Order order=new Order();
	order.setAddress("doraa");
	order.setAmount(10000);
	dao.createItems(list, order);
	
}
}
