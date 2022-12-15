/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.project;

import java.awt.event.*;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JTextField;  
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.util.ArrayList;


/**
 *
 * @author Federico
 */
class ReceiptFrame implements ActionListener{
    
    public ReceiptFrame( ){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Finalize");
        list = new JList();
        panel.setLayout(null);
        frame.setSize(500,200);
        panel.add(button);
        button.setBounds(375, frame.getHeight()-100, 100,30);
        button.addActionListener(this);
        panel.add(list);
        list.setBounds(25,25,400,frame.getHeight()-150);
        frame.add(panel);
        frame.setLocation(200,200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        orders = new ArrayList<>();
    }
    
    public ReceiptFrame(javax.swing.DefaultListModel<String> x ){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Finalize");
        list = new JList(x);
        panel.setLayout(null);
        frame.setSize(500,100+15*x.getSize());
        panel.add(button);
        button.setBounds(375, frame.getHeight()-100, 100,30);
        button.addActionListener(this);
        panel.add(list);
        list.setBounds(25,25,375,frame.getHeight()-150);
        frame.add(panel);
        frame.setLocation(200,200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        orders = new ArrayList<>();
        
    }
    
    public void setList(javax.swing.DefaultListModel<String> x){
        panel.removeAll();
        panel.setLayout(null);
        frame.setSize(500,200+15*x.getSize());
        panel.add(button);
        button.setBounds(375, frame.getHeight()-100, 100,30);
        panel.add(list);
        list.setModel(x);
        list.setBounds(25,25,375,frame.getHeight()-150);
        frame.add(panel);
    }
    public void setVisible(boolean x){
        this.frame.setVisible(x);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        FinalProject.homeFrame.setVisible(true);
        orders.add(FinalProject.order);
        FinalProject.order = new Order();
    }
    public ArrayList<Order> getOrders(){
        return this.orders;
    }
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JList list;
    private ArrayList<Order> orders;
    
}

class Inventory implements ActionListener{
    public Inventory(){
        ingredients =  new ArrayList<Ingredient>() {{
            add(new Ingredient("Gyro meat",0));
            add(new Ingredient("Chicken",0));
            add(new Ingredient("Tsatsiki",0));
            add(new Ingredient("Hummus",0));
            add(new Ingredient("Lettuce",0));
            add(new Ingredient("Tomato",0));
            add(new Ingredient("Cucumber",0));
            add(new Ingredient("Onion",0));
            add(new Ingredient("Pita bread",0));
        }};
        frame = new JFrame();
        panel = new JPanel();
        addButton = new JButton("Add");
        doneButton = new JButton("Done");
        textField = new JTextField();
        comboBox = new JComboBox();
        panel.setLayout(null);
        frame.setSize(350,300);
        panel.add(addButton);
        addButton.setBounds(250, 75, 75,30);
        addButton.addActionListener(this);
        panel.add(doneButton);
        doneButton.setBounds(200, 225, 75,30);
        doneButton.addActionListener(this);
        panel.add(textField);
        textField.setBounds(144, 75, 100,30);
        panel.add(comboBox);
        comboBox.setBounds(38,75, 100,30);
        for(Ingredient i:ingredients){
            comboBox.addItem(i.getName());
        }
        frame.add(panel);
        frame.setLocation(200,200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }
    public Ingredient getIngredient(int x){
        return ingredients.get(x);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add")){
            ingredients.get(comboBox.getSelectedIndex()).changeAmount(Integer.parseInt(textField.getText()));
        }else{
            this.frame.dispose();
            FinalProject.homeFrame.setVisible(true);
        }
    }
    
    private JFrame frame;
    private JPanel panel;
    private JButton addButton;
    private JButton doneButton;
    private JTextField textField;
    private JComboBox comboBox;
    private ArrayList<Ingredient> ingredients;
    
}
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    static Order order = new Order();
    static Inventory inventory= new Inventory();
    static GUIHomeJFrame homeFrame = new GUIHomeJFrame();
    static GUIGyroJFrame gyroFrame = new GUIGyroJFrame();
    static GUIDrinkJFrame drinkFrame = new GUIDrinkJFrame();
    static ReceiptFrame receiptFrame = new ReceiptFrame();
    
    
    public static void main(String[] args) {
        homeFrame.setVisible(false);
        gyroFrame.setVisible(false);
        drinkFrame.setVisible(false);
        receiptFrame.setVisible(false);
    }
    
}