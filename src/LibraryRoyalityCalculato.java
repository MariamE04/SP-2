public class LibraryRoyalityCalculato {
    public static void main(String[] args){
        Author author = new Author("Henrik Larsen");
        Title audiobook = new AudioBook("The end", "SKØN", 150, 400); //Dette erklærer en variabel ved navn audiobook af typen Title
        Title printedBook1 = new PrintedBook("Under the moonlight","lYRIK", 200, 350);
        Title printedBook2 = new PrintedBook("How you think", "FAG",150,630);

        author.addTitle(audiobook);
        author.addTitle(printedBook1);
        author.addTitle(printedBook2);

        float totalPay = author.calculateTotalPay();


        System.out.println("Total payment for author titles :  " +  totalPay + " kr");
    }
}
