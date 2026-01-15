public class Airbus extends lietadlo{
    public AirbusModely model;
    public Airbus(int kolesa, int hmotnosť, int maxSpeed, String oznacenie, AirbusModely model) {
        super(kolesa, hmotnosť, maxSpeed, oznacenie);
        this.model = model;
    }
}
