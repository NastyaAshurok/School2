public class Classroom implements MoneyCalculator{
    int classNumber;
    int totalStudent;
    int beneficiary;

    public Classroom(int classNumber, int totalStudent, int beneficiary) {
        this.classNumber = classNumber;
        this.totalStudent = totalStudent;
        this.beneficiary = beneficiary;
    }

    public double calculateMoney() {
        return totalStudent-beneficiary;
    }

    public static class Library implements MoneyCalculator{

        @Override
        public double calculateMoney() {
            return 100;
        }
    }
}
