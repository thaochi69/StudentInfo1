/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.StudentList;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class StudentManager extends Menu<String>{
    private StudentList list= new StudentList();
    public StudentManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.display();
                break;
            
            case 2:
                System.exit(0);        
        }
    }
}
    

