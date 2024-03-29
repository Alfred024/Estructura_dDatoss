
package main;

public class Bichitos {

    public static void main(String[] args) {
        
        
        
        //Reproducción de bichos
        
        //El ejercicio consiste en calcular el npumero total de bichos que habrá en un día límite (Variable D)
        //Para ello existen tres tipos de bichos (A,B,C), y cada uno tiene determinaods números de hijos de diferente tipo al día, así: 
        
        /*         1 hijo A                2 hijos B                  1 hijo A     
        Bicho A--> 3 hijos B      Bicho B--> 2 hijos C       BIcho C--> 4 hijos C  
                   1 hijo C                                                                */
                 
        //Además, al siguiente día, los hijos darán más hijos, y los bichos antiguos/padres seguirán teniendo hijos         
        
        //N = cantidad inicial de bichos de tipo A
        //D = días totales de reproducción
        
        //El ejercicio está resuelto a través de un método recursivo al cual quiero añadirle más cosas, debido a que 
        
        int N = 2;
        int D = 3;
        
        System.out.print(((bichitos2(N,D,"A")-N)*N)+"\n");
        
    }
    
    static public int bichitos2(int N, int D, String tipoBicho){
        
        int total = N;
        
        
            while(D>0){
                    if("A".equals(tipoBicho)){
                        total= bichitos2(total, D-1,"A"); //5
                        total= bichitos2(total, D-1,"B"); //4
                        total= bichitos2(total, D-1,"B"); //4
                        total= bichitos2(total, D-1,"B"); //4
                        total= bichitos2(total, D-1,"C"); //5
                    }
                    if("B".equals(tipoBicho)){
                        total= bichitos2(total, D-1,"B");
                        total= bichitos2(total, D-1,"B");
                        total= bichitos2(total, D-1,"C");
                        total= bichitos2(total, D-1,"C");
                    }
                    if("C".equals(tipoBicho)){
                        total= bichitos2(total, D-1,"A");
                        total= bichitos2(total, D-1,"C");
                        total= bichitos2(total, D-1,"C");
                        total= bichitos2(total, D-1,"C");
                        total= bichitos2(total, D-1,"C");
                    }
                D--;
                //total*=N;
            }
            
            
        return total+1;
        
    }
    
}
