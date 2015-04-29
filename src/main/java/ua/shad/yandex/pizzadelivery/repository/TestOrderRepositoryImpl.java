/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.repository;

import ua.shad.yandex.pizzadelivery.domain.Order;
import java.util.LinkedList;
import java.util.List;


public class TestOrderRepositoryImpl implements OrderRepository {

    public List<Order> lo;

    public TestOrderRepositoryImpl() {
        this.lo = new LinkedList<Order>();
        ;
    }

    public TestOrderRepositoryImpl(List<Order> lo) {
        this.lo = lo;
    }

    public void addOrder(Order order) {
        this.lo.add(order);
    }

    public List<Order> getAllOrders() {
        return this.lo;
    }
}
