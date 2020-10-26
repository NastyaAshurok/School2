import java.util.List;

public class GoodsStore {
    List<Good> goods; // [1,1,1,1,1]

    double totalPrice =0;
    public double moneyForGoods() {
        return totalPrice;
    }

    public Good buy() {
        Good good = null;
        totalPrice += good.getPrice();
        return good;
    }

    public Good buy(String museum, int count, boolean isDiscount) {

    }
}
