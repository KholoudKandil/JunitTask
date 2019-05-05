/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadeel
 */
public class Vectors {
    ICalculationsService calculationsService;
    
    public Vectors(){
    }
    
    public Vectors(ICalculationsService calcService){
        calculationsService = calcService;
    }
    
    public boolean equal(int[] a, int[] b) 
    {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("null argument");
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    
    public int scalarMultiplication(int[] a, int[] b) 
    {
        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("null argument");
        }

        if (a.length != b.length) {
            throw new IllegalArgumentException(
                    "different tuple of the vectors ("
                    + a.length + ", " + b.length + ')');
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += calculationsService.multiply(a[i], b[i]);
        }
        return sum;
    }
    
    
}
