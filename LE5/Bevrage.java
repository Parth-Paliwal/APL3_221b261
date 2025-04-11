abstract class Bevrage{
    
    protected void pour(int qty){
        System.out.println("pour " + qty + " ml of bevrage");
    }
    protected void addContiments(String s){
        System.out.println("add" + s + " to bevrage");
    }
    
    protected void stir(int time){
        System.out.println("stir it for " + time + " seconds");
    }
    
    protected void serve(){
        System.out.println("serve it through waiter");
    }
    public abstract void templateMethod();
    
}