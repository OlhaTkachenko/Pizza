/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.domain;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.shad.yandex.pizzadelivery.service.OrderService;
import ua.shad.yandex.pizzadelivery.service.PizzaService;


public class PizzaTest extends ExtendedConfig{
    
   @Autowired
   private PizzaService pizzaService;
   @Autowired
   private OrderService orderService;
   
    @Test
    public void testSetName() {
       
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        
        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems(pizzas.get(0), pizzas.get(1));
        orderService.placeOrder(newOrder1);
        
        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems(pizzas.get(0));
        orderService.placeOrder(newOrder2);
        
        List<Order> orders = orderService.getAllOrders();
        
        for (Order or : orders) {
            System.out.println(or.getPizass().get(0).getName() + " " + or.getPizass().get(0).getType());
        }
    }
}

