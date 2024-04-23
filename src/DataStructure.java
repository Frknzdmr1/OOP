public class DataStructure {
    public static void main(String[] args) {
        Employee emp =new Employee();
        Employee emp2 =new Employee();
        Employee emp3 =new Employee();

        emp.name = "Jeff";
        emp.age = 32;
        emp.jobTitle = "Construction worker";

        emp2.name = "Sarah";
        emp2.age = 28;
        emp2.jobTitle = "Accountant";

        emp3.name = "Bill";
        emp3.age = 52;
        emp3.jobTitle = "Project Manager";

        bar(emp3);
    }
    static void bar(Employee e) {
        System.out.println(e.name + " is " + e.age + " years old " + e.jobTitle);
    }
}