/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.epam.rd.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.shad.yandex.pizzadelivery.domain.Pizza;
import ua.shad.yandex.pizzadelivery.service.PizzaService;

/**
 *
 * @author Ольга
 */
@RestController
public class PizzaRestController {
    @Autowired
    private PizzaService pizzaService ;
    @RequestMapping(method = RequestMethod.GET, value = "hello")
    public String hello(){
        return "Hello from RESTcontroller";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "pizza")
    public List<Pizza> getAllPizzas(){
        return pizzaService.getAllPizzas();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "pizza/{id}")
    public Pizza getPizzaById(@PathVariable("id")long id,
            @PathVariable("itemid")long itemid){
        return pizzaService.getPizzaById(id);
    }        
    
    @RequestMapping(method = RequestMethod.POST,
            value = "pizza",
            headers = "content-type=application/json")
    public void addPizza(Pizza pizza) {
        System.out.println(pizza);
        pizzaService.addPizza(pizza);
    }
}
