public class Publication {
    private String title, language;
    private double price;

    Publication(String title, String language, double price){
        this.title=title;
        this.language=language;
        this.price = price;
    }

    public void print(){
        System.out.println(
                "title: " + this.title + " "
                + "language: " + this.language + " "
                + "price:" + this.price
        );
    }


}
