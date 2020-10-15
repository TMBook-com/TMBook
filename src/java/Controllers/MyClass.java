/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class MyClass {
    public static boolean isInt(String s){
        try{
            int d = Integer.parseInt(s);
            return true;
        }catch(Exception ex){
            return false;
        } 
    }
    public static int NullCart(TreeMap<Integer,Integer> cart){
        
        try{
            int soluong=0;
            if(cart==null){
                soluong=0;
            }else{
                soluong = cart.size();
            }
            return soluong;
        }catch(Exception ex){   
            ex.printStackTrace();
            return -2;
        }       
    }
}
