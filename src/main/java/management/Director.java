package management;

public class Director extends Manager{

    private final double budget;

    public Director(String name, String niNumber, double salery, String deptName, double budget) {
        super(name, niNumber, salery, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonous() {
        return getSalery() * 0.02;
    }
}
