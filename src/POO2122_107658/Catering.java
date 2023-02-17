package POO2122_1907658;

public class Catering extends Activity{
    private Option option;
    
    public Catering (Option option, int participantes) {
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
        FULL_MENU, DRINKS_AND_SNACKS, LIGHT_BITES
    }

    @Override
    public String toString() {
        return option + "Catering with '" + option + "' option for ";
    }
}
