import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        School school = new School("School79");

        // first floor
        List<Classroom> firstFloorClassList = Arrays.asList(
                new Classroom(1, 30, 5),
                new Classroom(2, 25, 1),
                new Classroom(3, 15, 2)
        );
        Floor firstFloor = new Floor(1);
        firstFloor.addClassrooms(firstFloorClassList);
        school.addFloor(firstFloor);

        //second floor
        List<Classroom> secondFloorClassList = Arrays.asList(
                new Classroom(1, 35, 6),
                new Classroom(2, 20, 1),
                new Classroom(3, 23, 2)
        );
        Floor secondFloor = new Floor(2);
        secondFloor.addClassrooms(secondFloorClassList);
        school.addFloor(secondFloor);

        //third floor
        List<Classroom> thirdFloorClassList = Arrays.asList(
                new Classroom(1, 30, 0),
                new Classroom(2, 20, 1)
        );
        Floor thirdFloor = new Floor(3);
        thirdFloor.addClassrooms(thirdFloorClassList);
        school.addFloor(thirdFloor);

        school.addFloor(new Classroom.Library());
        System.out.println("Total money for School Repairs: " + school.calculateMoney());
    }
}
