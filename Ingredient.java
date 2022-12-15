/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */
public class Ingredient {
    public Ingredient(String s, double f){
        this.name=s;
        this.amount = f;
    }
    public void changeAmount(double x){
        this.amount+=x; 
    }
    public double getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    private String name;
    private double amount;
    
}
