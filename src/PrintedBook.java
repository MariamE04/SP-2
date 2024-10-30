public class PrintedBook extends Title {
    private int pages;

    PrintedBook(String Title, String literatureType, int copies, int pages){
        super(Title, literatureType,copies);
        this.pages = pages;
        this.rate = 0.067574;
    }

    @Override
    protected double calculatePoints() {
        return calculateLiteraturePoints() * copies * pages;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType().toLowerCase()) {
            case "FAG":
                return 2; // Antal sider ganget med point for horror
            case "LYRIK":
                return 3;
            case "SKØN":
                return 2.3;
            default:
                return  0.067574; // Standardværdi, hvis litteraturtypen ikke genkendes
        }
    }

}


