package management;

import staff.Employee;

public class Manager extends Employee {

    private final String deptName;

    public Manager(String name, String niNumber, double salery, String deptName) {
        super(name, niNumber, salery);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
