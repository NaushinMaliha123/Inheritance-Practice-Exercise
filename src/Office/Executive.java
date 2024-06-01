package Office;


public class Executive extends ManagerNew {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive: " + super.toString();
    }
}
