class Rum extends Bevrage{
    public void templateMethod(){
        pour(35);
        addContiments("water");
        stir(35);
        serve();
    }
}