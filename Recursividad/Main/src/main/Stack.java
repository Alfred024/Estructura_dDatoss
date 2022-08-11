
package main;

public class Stack {
    
    Nodo top;
    int size=0;
    
    public Stack(int value){
        this.top = null;
    }
    
    public void addNode(int value){
        Nodo newNode = new Nodo(value);
        
        if(top==null){
            top = newNode;
        }else{
            top.next = newNode;
            top = newNode;
        }size++;
    }
    
    public void showData(){
        
    }
}
