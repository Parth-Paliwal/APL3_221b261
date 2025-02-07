abstract class Pandav extends Bharatvanshi {
    
    // Pandavs are all fighters and obedient, so these are concrete methods
    @Override
    public void fight() {
        System.out.println(this.getClass().getSimpleName() + " is a good fighter.");
    }

    @Override
    public void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }

    // Abstract method for kindness as it varies across Pandavs
    public abstract void kind();
}