


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

    public int getSize(){
        return size;
    }
    
    public int getTop(){
        return top.value;
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
    
    public void pop(){
        if(top != null){
            top = top.next;
            size--;
        }else{
            JOptionPane.showMessageDialog(null, "No hay elementos en la lista");
        }
    }
    
    //Limpiar toda la pila
    public void clear(){
        top = null;
        size = 0;
    }
    
    public void showData(){
        Nodo aux = top;
        if(aux != null){
            String stack = "";
            while(aux.next != null){
                stack+="["+aux.value+"]\n";
                aux = aux.next;
            }stack+="["+aux.value+"]\n";
            JOptionPane.showMessageDialog(null, "Stack\n"+stack);
        }else{
            JOptionPane.showMessageDialog(null, "No hay elementos en la lista");
        }
        
    }
}
