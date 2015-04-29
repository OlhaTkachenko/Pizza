/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.domain;

public class Pizza {

    public enum PizzaType {

        Sea, Meat, Vegetarian;
    }
    private String name;
    private int price;
    private PizzaType type;

    public Pizza(String name, int price, PizzaType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Pizza() {
        this.name = "";
        this.price = 0;
        this.type = PizzaType.Sea;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setPrice(int i) {
        this.price = i;
    }

    public void setType(PizzaType s) {
        this.type = s;
    }

    public String getName() {
        return this.name;
    }

    public PizzaType getType() {
        return this.type;
    }
}
