package com.niit.perfumic.dao;


import com.niit.perfumic.model.UserOrder;

public interface OrderDAO {
	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}


