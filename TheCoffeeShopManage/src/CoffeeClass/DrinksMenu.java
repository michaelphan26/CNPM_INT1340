/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeClass;

/**
 *
 * @author Hida
 */
public class DrinksMenu {
    public String id;
    public String name;
    public int priceM;
    public int priceL;
    public String type;
    public String status;

    public DrinksMenu(String id, String name, int priceM, int priceL, String type, String status) {
        this.id = id;
        this.name = name;
        this.priceM = priceM;
        this.priceL = priceL;
        this.type = type;
        this.status = status;
    }

    public DrinksMenu() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriceM() {
        return priceM;
    }

    public int getPriceL() {
        return priceL;
    }

    public String getType() {
        return type;
    }   
    
    public String getStatus(){
        return status;
    }
}

