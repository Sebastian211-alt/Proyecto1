/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

/**
 *
 * @author SebasTati
 */
public class Proyecto1 {
     
    public static void main(String[] args){
        
        int a,b,r;
        double res;
        
        a=6;
        b=3;
        
        r=a%b;
        
        ++a;
        ++a;
        ++a;
        System.out.println("a = " + a);
        res = (double)a/b;
        
        System.out.println(r);
        System.out.println(res);
        
    }
    
}
