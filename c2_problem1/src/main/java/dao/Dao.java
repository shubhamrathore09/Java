package dao;

import java.util.List;

import exception.NotFoundException;
import model.ItemOrders;
import model.Order;

public interface Dao {

	public void createItem(ItemOrders itemOrders, Order order);
	public void createItems(List<ItemOrders> list, Order order);
	public ItemOrders getItem(int id) throws NotFoundException;
	public Order getOrder(int id)throws NotFoundException;
	
	
}
