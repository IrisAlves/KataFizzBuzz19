/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam201
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int i){
        String cadenaI = i+"";

        if (i%3==0 && i%5==0) { 

            return "FizzBuzz";
        }else{
            if (i%3==0 || cadenaI.contains("3")){
                return "Fizz";
            }
            if (i%5==0 || cadenaI.contains("5")) {
                return "Buzz";
            }
        }
        return i+"";
    }
}
