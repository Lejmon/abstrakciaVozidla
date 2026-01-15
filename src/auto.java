public class auto extends vozidlo{
    public String znacka;

    public auto(int kolesa, int hmotnosť, int maxSpeed) {
        super(kolesa, hmotnosť, maxSpeed);
        znacka = "BMW";
    }

    @Override
    public void pohniSa() {

    }

    @Override
    public void vypisInfo() {
        System.out.println("Auto má " + this.kolesa + " kolesá.");
        System.out.println("Auto váži " + this.hmotnosť + " kilogramov.");
        System.out.println("Auto má maximálnu rýchlosť " + maxSpeed + " km/h.");
    }
}
