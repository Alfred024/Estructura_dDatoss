
public class Main {
    public static void main(String[] args) {
        
        Stack newStack = new Stack();
        
        newStack.push(30); newStack.push(20); newStack.push(10);
        System.out.println("Top: "+newStack.getTop());
        System.out.println("Size: "+newStack.getSize());
        newStack.showData();
    }
}
