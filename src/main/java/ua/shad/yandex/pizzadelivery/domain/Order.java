/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.domain;

import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("order")
@Scope("prototype")
public class Order {

    private int id;
    private int date;
    private String name;
    private List<Pizza> pizass;
    private int price;

    public Order(int id, int date, List<Pizza> p, int price) {
        this.id = id;
        this.date = date;
        this.name = "" + id + date;
        this.pizass = p;
        this.price = price;
    }

    public Order() {
        this.id = 0;
        this.date = 0;
        this.name = "" + id + date;
        this.pizass = new LinkedList<>();
        this.price = 0;
    }

    public void addItems(Pizza p) {
        this.pizass.add(p);
    }

    public void addItems(Pizza p, Pizza po) {
        this.pizass.add(p);
        this.pizass.add(po);
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDate() {
        return this.date;
    }

    public List<Pizza> getPizass() {
        return this.pizass;
    }

    void setId(int aInt) {
        this.id = aInt;
    }

    void setPizass(List<Pizza> pList) {
        this.pizass = pList;
    }

    void setDate(int aInt) {
        this.date = aInt;
    }

    void setName(String string) {
        this.name = string;
    }

    void setPrice(int i) {
        this.price = i;
    }

}
