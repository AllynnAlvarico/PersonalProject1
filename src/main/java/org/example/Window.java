package org.example;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.Scanner;

public class Window extends JFrame implements WindowCondition, ActionListener {

    private int app_height = 600, app_width = 600;
    private String shop_title;

    public Window (Scanner key){
        setApplicationTitle(key);
        setAppWindowSize();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void setInputTitle(){
        this.shop_title =  JOptionPane.showInputDialog("Enter the Store Name");
    }
    public void setApplicationTitle(Scanner key){
        setInputTitle();
        if(shop_title.isEmpty()){
            this.shop_title = "Empty";
        }else {
            this.setTitle(this.shop_title);
        }
    }
    public void setAppWindowSize() {
        this.setSize(app_width, app_height);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent e){

    }





}
