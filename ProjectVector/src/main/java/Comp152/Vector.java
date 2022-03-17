package Comp152;

import java.util.Arrays;

public class Vector {
    public double [] elements;

    public Vector(double[] array){
        // creat am array that store the same number
        // of elements as the parameter
        elements = new double[array.length];
        for ( int i = 0; i < array.length; i++){
            elements[i] = array[i];
        }

    }
    public double geometircLength () {
        double x = 0.0;
        for (int i = 0; i < elements.length; i++){
            x = Math.pow(elements[i], 2);
        }
        return Math.sqrt(x);
    }
    public double getDimension (){
        double x = 0.0;
        for (int i = 0; i < elements.length; i++){
             x  = elements.length;
        }
        return x;
    }

    public String toString (){
        String x = null;
        for (int i = 0; i < elements.length; i++){
            x = Arrays.toString(elements);
        }
        return x;

    }
    public int addVector () {

    }
}


