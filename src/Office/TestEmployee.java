package Office;

public class TestEmployee {
    public static void main(String[] args) {

        EmployeeNew emp = new EmployeeNew("John Doe", 50000);
        System.out.println(emp);


        ManagerNew manager = new ManagerNew("Jane Smith", 60000, "IT");
        System.out.println(manager);


        Executive exec = new Executive("Alice Johnson", 80000, "Finance");
        System.out.println(exec);
    }
}

