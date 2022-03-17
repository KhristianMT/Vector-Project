package Comp152;

public class Main {
    public static void main(String[] args) {
        double [] arr = {1.0, 2.0, 3.0,};
        double [] arr2 = {1.0,3.0,3.0};
        Vector vect1 = new Vector(arr);
        Vector vect2 = new Vector(arr2);
        System.out.println(vect1.geometircLength());
        System.out.println(vect1.getDimension());
        System.out.println(vect1.toString());
        System.out.println(vect1.addVector());
    }
}
