/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import ua.shad.yandex.pizzadelivery.domain.Order;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.shad.yandex.pizzadelivery.repository.OrderRepository;

@Repository("orderService")
public abstract class SimpleOrderService implements OrderService {

    private OrderRepository base;

    @Autowired public SimpleOrderService(OrderRepository base) {
        this.base = base;
    }

    @Override
    public abstract Order createNewOrder();

    @Override
    public void placeOrder(Order order) {
        this.base.addOrder(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return this.base.getAllOrders();
    }

}
