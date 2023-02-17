package POO2122_1907658;

public class Sport extends Activity {
    private Modality mod;

    public Sport (Modality mod, int participantes){
        super(25, participantes);
        this.mod = mod;
    }

    public Modality getMod() {
        return this.mod;
    }

    public void setMod(Modality mod) {
        this.mod = mod;
    }

    public enum Modality {
        KAYAK, BIKE
    }

    @Override
    public String toString() {
        return mod + " sporting activity with ";
    }
}
