
package main;

public class Main {

    public static void main(String[] args) {
        
        /*int factorialX = 8;
        System.out.print("Factorial de "+factorialX+": "+factorial(factorialX)+"\n");*/
        
        int vuelta = 7;
        System.out.println("Secuencia fibonacci hasta la vuelta #"+vuelta+": "+fibonacci(1,1,vuelta));
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
    static int fibonacci(int x, int y,int lim){
        int res = 1;
        while(lim>0){ 
            res = x + y;
            y = x;
            x = res;
            fibonacci(x,y,lim-1);
            lim--;
        }
        
        return res;
    }
}
