
package main;

public class Primos_Fractales {
    public static void main(String args[]){
        
        String N = "5323";
        
        System.out.println(primoFractal(N));
        
    }
    
    static boolean primoFractal(String N){
        boolean primF = true;
        while(primF != false){
            int n = Integer.parseInt(N);
            
            int div = 1;
            int cont = 0;
            
            while(div <= n){
                if(n%div == 0){
                    cont++;
                }div++;
            }
            
            if(cont == 2){
                String N1="",N2="";
                cont = N.length()/2;
                for (int i = 0; i <= cont; i++) {
                    N1+=N.charAt(i);
                }
                
                for (int i = cont+1; i < N.length(); i++) {
                    N2+=N.charAt(i);
                }
                
                if(primoFractal(N1) && primoFractal(N2)){
                    primF = true;
                }else{
                    primF = false;
                }
               
            }else{
                primF = false;
            }
        }
        return primF;
    }
    
}
