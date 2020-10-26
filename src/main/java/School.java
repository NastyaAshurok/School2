import java.util.ArrayList;
import java.util.List;

public class School implements MoneyCalculator{
    String name;
    List<MoneyCalculator> floors;

    GoodsStore food; // food from the buffet for 1 Classroom
    GoodsStore ticket; // ticket to the museum for 1 Classroom


    public School(String name) {

        this.name = name;
        this.floors = new ArrayList<>();
    }

    public void addFloor(MoneyCalculator floor) {

        floors.add(floor);
    }

    public double calculateMoney(){
        double money = 0;
        for(MoneyCalculator floor: floors){
            money = money + floor.calculateMoney();
        }
        return money;
    }

    public Good buyTicket(String museum, int count, boolean isDiscount) {
        return ticket.buy(museum,count,isDiscount);
    }

    public Good buyFood(String dish, int count, String diet) {
       return food.buy(dish,count,diet);
    }

    public double moneyForGoods() {
        return food.moneyForGoods() + ticket.moneyForGoods();
    }
}