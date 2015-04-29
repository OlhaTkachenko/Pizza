/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import ua.shad.yandex.pizzadelivery.domain.Order;
import java.util.List;


public interface OrderService {

    public Order createNewOrder(); // Order should be a prototype bean

    public List<Order> getAllOrders();

    public void placeOrder(Order order);

}
