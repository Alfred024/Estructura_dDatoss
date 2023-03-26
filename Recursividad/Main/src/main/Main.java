
package main;

public class Main {

    public static void main(String[] args) {
        
        /*int factorialX = 8;
        System.out.print("Factorial de "+factorialX+": "+factorial(factorialX)+"\n");*/
        
        /*int vuelta = 7;
        System.out.println("Secuencia fibonacci hasta la vuelta #"+vuelta+": "+fibonacci(1,1,vuelta));*/
        
        int discos = 3;
        System.out.println("Número de movimientos necesarios con #"+discos+" cantidad de discos: "+ torresD_Hanoi(discos,1,2,3));
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
    
    //Este método lo saqué de un algoritmo en internet
    //Torres de Hanoi con algoritmo (Movimientos necesarios)
    static int torresD_Hanoi(int Discos, int origen, int aux, int destino){
        int res = 1;
        if(Discos == 1){
            return res;
        }else{
            res += torresD_Hanoi(Discos-1, origen, destino, aux);
            res += torresD_Hanoi(Discos-1, aux, origen, destino);
        }
        
        return res;
    }
}
