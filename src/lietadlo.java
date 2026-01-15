public class lietadlo extends vozidlo{
    private String oznacenie;

    public lietadlo(int kolesa, int hmotnosť, int maxSpeed, String oznacenie) {
        super(kolesa, hmotnosť, maxSpeed);
        this.oznacenie = oznacenie;
    }

    @Override
    public void pohniSa() {

    }

    @Override
    public void vypisInfo() {
        System.out.println("Auto má " + this.kolesa + " kolesá.");
        System.out.println("Auto váži " + this.hmotnosť + " kilogramov.");
        System.out.println("Auto má maximálnu rýchlosť " + maxSpeed + " km/h.");
        System.out.println("Oznacenie lietadla je: " + this.oznacenie);
    }
}
