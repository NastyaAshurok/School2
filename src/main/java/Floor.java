import java.util.List;

public class Floor implements MoneyCalculator{

    int floorNumber;
    List<Classroom> classrooms;
    
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    
    
    public void addClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public double calculateMoney() {
        double money = 0;
        for(Classroom classrooms: classrooms){
            money = money + classrooms.calculateMoney();
        }
        return money;
    }
}
