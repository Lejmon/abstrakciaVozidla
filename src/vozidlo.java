public abstract class vozidlo {
    public int kolesa;
    public int hmotnosť;
    public int maxSpeed;

    public vozidlo(int kolesa, int hmotnosť, int maxSpeed) {
        this.kolesa = kolesa;
        this.hmotnosť = hmotnosť;
        this.maxSpeed = maxSpeed;
    }

    public abstract void pohniSa();
    public abstract void vypisInfo();
}
