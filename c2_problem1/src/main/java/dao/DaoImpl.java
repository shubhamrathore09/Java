package dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import em.Emu;
import exception.NotFoundException;
import model.ItemOrders;
import model.Order;

public class DaoImpl implements Dao{

	public void createItem(ItemOrders itemOrders, Order order) {
		EntityManager em=Emu.provide();
		em.getTransaction().begin();
		
		order.setDateTime(LocalDateTime.now());
		
		itemOrders.setDateTime(LocalDateTime.now());
		
		itemOrders.setOrder(order);
		
		List<ItemOrders>list=new ArrayList<ItemOrders>();
		list.add(itemOrders);
		
		order.setList(list);
		
		em.persist(itemOrders);
		em.getTransaction().commit();
		em.clear();
		
	}

	public void createItems(List<ItemOrders> list, Order order) {
		// TODO Auto-generated method stub
		
		EntityManager em=Emu.provide();
		em.getTransaction().begin();
		for(ItemOrders i:list) {
			i.setDateTime(LocalDateTime.now());
			i.setOrder(order);
		}
		order.setList(list);	
		em.persist(order);
		em.getTransaction().commit();
		em.clear();
	}
	
	public static void main(String[] args) {
		
	}

	public ItemOrders getItem(int id) throws NotFoundException{
		// TODO Auto-generated method stub
		EntityManager em=Emu.provide();
		ItemOrders itemOrders=em.find(ItemOrders.class, id);
		if(itemOrders==null) {
			throw new NotFoundException("not available");
		}
		System.out.println(itemOrders.getOrder());
		 return itemOrders;
		
	}

	public Order getOrder(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		EntityManager em=Emu.provide();
	Order order=em.find(Order.class, id);
		if(order==null) {
			throw new NotFoundException("not available");
		}
		System.out.println(order.getList());
		 return order;
	}
	
	

}
