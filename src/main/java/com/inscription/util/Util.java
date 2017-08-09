package com.inscription.util;


public class Util {

	/**
	 * function used to avoid cicles on orders and products, since the lazy load
	 * of jpa does not work
	 * 
	 * @param orders
	 * @return
	 */
//	public static List<Student> avoidCicles(List<Student> orders) {
//		for (Student order : orders) {
//			avoidCicles(order);
//		}
//		return orders;
//	}
//
//	public static Student avoidCicles(Student order) {
//		for (OrderProduct orderProduct : order.getOrderProducts()) {
//			orderProduct.setOrder(null);
//		}
//		return order;
//	}
}
