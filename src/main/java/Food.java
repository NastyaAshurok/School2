public class Food extends Good{
   // String diet;

    public Food(String name, double price) {
        super(name, price);
        this.diet = diet;
    }

    @Override
    public double getPrice() {
        double coefficient = 1;
        switch (name) {
            case "#15": {coefficient = 0.5;break;}
            case "#5": {coefficient = 1.5;break;}
        }
        return price*coefficient;
    }
}
