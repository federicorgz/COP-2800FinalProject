/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */
import java.util.ArrayList;

class Gyro extends Item{
	
	String meats;
	String sauce;
	boolean extraMeat;
	
	ArrayList<String> toppings = new ArrayList<>();
	public Gyro(String meat, boolean extra, String sauce, ArrayList<String> toppings ){
		super(12.50+(meat.equals("Mixed") ? 2.5:0)+(extra ? 2.5:0));
		this.meats = meat;
		this.extraMeat= extra;
		this.sauce = sauce;
		this.toppings = toppings;
	}
	
	
	@Override
	
	public String toString(){
		String s = "Gyro:\nMeat: "+meats+"\nExtra meat: "+ extraMeat+"\nSauce: "+sauce;
		for(String i: toppings){
			s+="\n"+i;
		}
		return s;
	}
}