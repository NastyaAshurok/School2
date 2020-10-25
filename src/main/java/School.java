import java.util.ArrayList;
import java.util.List;

public class School implements MoneyCalculator{
   // public String calculateMoney;
    String name;
    List<MoneyCalculator> floors;
    //Classroom.Library library;

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
}