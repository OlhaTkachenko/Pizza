/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import java.util.LinkedList;
import ua.shad.yandex.pizzadelivery.domain.Order;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ua.shad.yandex.pizzadelivery.domain.Pizza;
import ua.shad.yandex.pizzadelivery.repository.OrderRepository;


public class SimpleOrderService implements OrderService {

    private OrderRepository base;
    private int counter;
    private DataSource dataSource;
    //private JdbcTemplate jdbcTemplateObject;
   
    @Autowired
    public SimpleOrderService(OrderRepository base) {
        this.base = base;
        counter = 0;
        this.dataSource = dataSource;
        //this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public Order createNewOrder(){
        List<Pizza> pizzas = new LinkedList<>();
        Pizza pi = new Pizza("one",3,Pizza.PizzaType.Meat);
        pizzas.add(pi);
        Order ord = new Order(counter,2,pizzas,3);
        counter++;
       return ord;
    }

    @Override
    public void placeOrder(Order order) {
        this.base.addOrder(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return this.base.getAllOrders();
    }

}
