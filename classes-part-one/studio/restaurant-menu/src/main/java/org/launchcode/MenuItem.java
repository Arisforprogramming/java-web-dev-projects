package org.launchcode;

import java.time.LocalDate;


public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

//constrctors
    public MenuItem(String name,String description,double price,String category, boolean isNew){

        this.name = name;
        this.description = description;
        this.price =price;
        this. category = category;
        this.isNew =isNew;
    }
 //getter
    public String getName(){
        return name;
    }
    public String getDescription(){
        return getDescription();
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
//and setter
    public void setName(String aName){
        name = aName;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
