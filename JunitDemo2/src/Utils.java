/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadeel
 */
public class Utils {
    ICalculationsService calculator;
    
    public Utils(ICalculationsService calcService){
        calculator = calcService;
    }
     public Utils( ){
       
    }

    
    public int ComputeFactorial(int number)
    {
        if(number < 0)
            throw new IllegalArgumentException("Can't compute factorial for negative numbers");
        
        int result = 1;
        for(int i = number; i > 1; i--){
            result = calculator.multiply(result, i);
        }
        return result;
    }
    
    public String Concat(String word1, String word2)
    {
        return word1 + word2;
    }
}    

