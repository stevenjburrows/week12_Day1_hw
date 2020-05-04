package staff;
public abstract class Employee {
    private String name;
    private String niNumber;
    private double salery;

    public Employee(String name, String niNumber, double salery) {
        this.name = name;
        this.niNumber = niNumber;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public void raiseSalery(double raise){
        if (raise > 0) {
            salery += raise;
        }
    }

    public double payBonous(){
        return salery * 0.01;
    }
}
