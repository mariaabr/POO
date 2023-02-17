package POO2122_1907658;

public class Culture extends Activity {
    private Option option; 
    
    public Culture (Option option, int participantes) {
        super(20, participantes);
        this.option = option;
    }

    public Option getOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, ART_MUSEUM, WINE_TASTING 
    }

    @Override
    public String toString() {
        return option + " with ";
    }
}
