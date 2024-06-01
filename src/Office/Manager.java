package Office;

public class Manager extends Employee{

    private double bonus;

    public Manager (String name , double baseSalary, int i){
        super(name,baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + this.bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);

    }

}
