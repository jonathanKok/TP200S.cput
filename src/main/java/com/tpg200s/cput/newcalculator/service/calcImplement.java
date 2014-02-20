/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tpg200s.cput.newcalculator.service;

/**
 *
 * @author student
 */
public class calcImplement implements calcService
{

    public int add(int a, int b)
    {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public double addDoubleVals(double a, double b) 
    {
        return (double) (a + b);
    }
    
    public boolean testTrue(boolean a)
    {
         if(a == true)
             return true;
         else
             return false;
    }
 
    public boolean testFalse(boolean a)
    {
         if(a == false)
             return true;
         else
             return false;
    }
    
    public boolean isEquals(Integer obj1, Integer  obj2)
    {
        return (obj1 == obj2);
    }
    
    public boolean isNotEquals(Integer obj1, Integer obj2)
    {
        return (obj1 != obj2);
    }

    
}
