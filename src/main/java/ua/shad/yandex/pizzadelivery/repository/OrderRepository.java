/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.repository;

import java.util.List;
import ua.shad.yandex.pizzadelivery.domain.Order;


public interface OrderRepository {

    public void addOrder(Order order);

    public List<Order> getAllOrders();
}
