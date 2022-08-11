


import javax.swing.JOptionPane;

public class Stack {
    
    Nodo top;
    int size;
    
    public Stack(){
        this.top = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(int value){
        Nodo newNode = new Nodo(value);
        
        if(top==null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }size++;
    }
    
    public void push2(int value){
        Nodo newNode = new Nodo(value);
        
        newNode.next = top;
        top = newNode;
    }
    
    public void pop(){
        if(top != null){
            top = null;
        }else{
            System.out.println("No hay elementos en la lista");
        }
    }
    
    //Limpiar toda la pila
    public void clear(){
        
    }
    
    public void showData(){
        Nodo aux = top;
        String stack = "";
        while(aux.next != null){
            stack+="["+aux.value+"]\n";
            aux = aux.next;
        }stack+="["+aux.value+"]\n";
        JOptionPane.showMessageDialog(null, "Stack\n"+stack);
    }
}
