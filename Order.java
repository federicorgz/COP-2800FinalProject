/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */
import java.util.HashMap;

public class Order{
	
	HashMap<Item,Integer> items =  new HashMap<Item,Integer>();
	String name;
	int numItems;
	float total=0;
	boolean militaryDiscount;
	
	
	
	public void addItems(Item x,int y){
                items.computeIfPresent(x,(k,v)->v+y);
		items.put(x,y);
		numItems+=y;
	}
	
	public void calcCost(){
            total=0;
    for (Item i: items.keySet()){
      total+= i.price*items.get(i);
    }
    total*= militaryDiscount ? 0.9:1;
	}
}
