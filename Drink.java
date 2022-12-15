/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */
import java.util.Map;
import java.util.stream.*;

public class Drink extends Item{
	
	public static String drinkNames[] ={"Coke", "Coke Zero", "Diet Coke", "Sprite","Aranciata","Chinotto","Limonata","Water","Sparkling Water"};
	
	public static Map<String, Double> drinks = Map.of(
    "Coke", 2.80,
    "Coke Zero", 2.80,
	"Diet Coke", 2.80,
	"Sprite", 2.80,
	"Aranciata", 4.00,
	"Chinotto", 4.00,
	"Limonata", 4.00,
	"Water", 2.00,
	"Sparkling Water", 2.50
	);
	
	String name;
	
	public Drink(String name){
		super(drinks.get(name));
		this.name = name;
		
	}
	
	
	@Override
	public String toString(){
		return name;
	}
}
