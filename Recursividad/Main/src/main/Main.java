
package main;

public class Main {

    public static void main(String[] args) {
        
        int factorialX = 8;
        System.out.print("Factorial de "+factorialX+": "+factorial(factorialX)+"\n");
        
    }
    
    //Calcular el factorial con métodos recursivos
    static int factorial(int num){
        int res = 1;
        if(num > 1){
          res = num * factorial(num-1);
        }
        return res;
    }
    
    //Calcular secuencia fibonacci hasta la vuelta X
    static int fibonacci(int vuelta){
        return 0;
    }
}
