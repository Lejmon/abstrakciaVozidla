public class Skoda extends auto {
    private SkodovkaModely model;

    public Skoda(int kolesa, int hmotnosť, int maxSpeed, SkodovkaModely model) {
        super(kolesa, hmotnosť, maxSpeed);
        this.model = model;
    }

    public Skoda(int kolesa, int hmotnosť, int maxSpeed) {
        super(kolesa, hmotnosť, maxSpeed);
    }

    @Override
    public void pohniSa() {
        super.pohniSa();
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Model škodovky je: " + this.model);
    }


}
