package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int moment; 
	private OrderStatusenum status; 
	
	private List<Orderltem> Orderltem = new ArrayList<>();

	
	public Order() {
	}
	
	public Order(int moment, OrderStatusenum status) {
		this.moment = moment;
		this.status = status;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}

	public OrderStatusenum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusenum status) {
		this.status = status;
	}

	public List<Orderltem> getOrderltem() {
		return Orderltem;
	}

	public void addOrderltem(Orderltem Orderltem) {
	        Orderltem.add(Orderltem);
	}
		
	public void removeOrderltem(Orderltem Orderltem) {
		 Orderltem.remove(Orderltem);
	}

	
}
