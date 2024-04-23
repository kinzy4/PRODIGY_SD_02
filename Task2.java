/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author Kinzy
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Random r1=new Random();
        int x= r1.nextInt(20);
        int y;
        do{
           System.out.println("Now guess the number in my mind");
           y=input.nextInt();
        if(y>x&&y!=x){System.out.println("too high");}
        else if(y<x&&y!=x){System.out.println("too low");}       
        }while(y!=x);
        
        System.out.println("Here you're congrates");      
    }
    
}
