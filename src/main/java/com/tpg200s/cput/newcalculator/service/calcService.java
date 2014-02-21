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
public interface calcService
{
    int add(int a, int b);
    double addDoubleVals(double a, double b);
    boolean isEquals(Integer a, Integer b);
    boolean isNotEquals(Integer a, Integer b);
    boolean testTrue(boolean a);
    boolean testFalse(boolean a);
    void errorMethod();
    
    
}
