/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FullBill;

import CoffeeClass.DrinksMenu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hida
 */
public class FullBill {
    public List<DrinksMenu> menuDrink = new ArrayList<>();
    public int billID;
    public String date;
    public String time;
    public String username;
    public String status;
    public int total;
    public String[] size = new String[7];
    public String[] amount = new String[7];

    public List<DrinksMenu> getMenuDrink() {
        return menuDrink;
    }

    public void setMenuDrink(List<DrinksMenu> menuDrink) {
        this.menuDrink = menuDrink;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public String[] getAmount() {
        return amount;
    }

    public void setAmount(String[] amount) {
        this.amount = amount;
    }
    
}


                    
