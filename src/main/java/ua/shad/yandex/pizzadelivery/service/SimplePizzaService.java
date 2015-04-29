/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import ua.shad.yandex.pizzadelivery.domain.Pizza;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import ua.shad.yandex.pizzadelivery.repository.PizzaRepository;
import ua.shad.yandex.pizzadelivery.repository.TestPizzaRepositoryImpl;


@Service("pizzaService")
public class SimplePizzaService implements PizzaService {

    PizzaRepository repository;

    @Autowired
    public SimplePizzaService(PizzaRepository rep) {
        this.repository = rep;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        List<Pizza> list = new LinkedList<>();
        TestPizzaRepositoryImpl a = new TestPizzaRepositoryImpl();
        for (Pizza s : a.pizzas) {
            list.add(s);
        }
        return list;
    }

    @Override
    public Pizza getPizzaById(long id) {
        return repository.getPizzaById((int)id);
    }

    @Override
    public void addPizza(Pizza pizza) {
        repository.add(pizza);
    }

}
