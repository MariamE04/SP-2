public class AudioBook extends Title {

    private int durationLnMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationLnMinutes) {
        super(title, literatureType, copies);
        this.durationLnMinutes = durationLnMinutes;
        this.rate = 0.067574 ;
    }

    @Override
    protected double calculatePoints() {
        return (durationLnMinutes * 0.5) * calculateLiteraturePoints() * copies ;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case "FAG":
                return 1.5;
            case "LYRIK":
                return 3;
            case "SKØN":
                return 0.5;
            default:
                return  0.067574;
        }
    }
}

