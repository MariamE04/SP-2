public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate =  0.067574;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();

    protected String getLiteratureType() {
        return this.literatureType; // Returner den gemte litteraturtype
    }

}
