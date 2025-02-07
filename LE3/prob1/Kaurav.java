abstract class Kaurav extends Bharatvanshi {
    
    // Kauravs are all fighters
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " is a good fighter.");
    }

    // Most Kauravs disobey, but Vikarn is an exception
    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " disobeys.");
    }

    // Abstract method for kindness (Vikarn is an exception here)
    public abstract void kind();
}