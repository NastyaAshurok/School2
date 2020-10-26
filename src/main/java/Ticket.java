public class Ticket extends Good {

   // boolean isDiscount;

    //double defaultPrice = 5;

    public Ticket(String name, double price) {
        super(name, 10);
    //    this.isDiscount = isDiscount;
    }

    @Override
    public double getPrice() {
        if (name.equals("Borsch")) {
            price/=2;
        }
        return price;
    }
}
