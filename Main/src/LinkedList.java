
public class LinkedList {
    
    Nodo start, end;
    
    public LinkedList(){
        this.start = null;
        this.end = null;
    }
    
    public void addStart(int value){
        if(start == null){
            Nodo newNode = new Nodo(value, null);
            start = end = newNode;
        }else{
            Nodo newNode =new Nodo(value, start);
            start = newNode;
        }
    }
    
    public void addEnd(int value){
        Nodo newNode = new Nodo(value, null);
        if(start == null){
            start = end = newNode;
        }else{
            end.next = newNode;
            end = newNode;
        }
    }
    
    public void showData(){
        Nodo aux = start;
        String lista="";
        if(start != null){
            while(aux.next != null){
                lista+=aux.value+"--> ";
                aux = aux.next;
            }lista+=aux.value+"--> null";
        }else{
            System.out.println("Sin elementos en la lista");
        }
        
    }
}
