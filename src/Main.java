public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrew",27,"middle",90000);
        Employee employee2 = new Employee("Josh",31,"manager",120000);
        Employee employee3 = new Employee();
        employee3.name="James";
        employee3.age=29;
        employee3.position="senior";
        employee3.salary=130000;
        Employee employee4 = new Employee();
        employee4.name="Joseph";
        employee4.age=38;
        employee4.position="boss";
        employee4.salary=200000;

        System.out.println(employee1.name);
        System.out.println(employee1.age);
        System.out.println(employee1.position);
        System.out.println(employee1.salary);

        System.out.println(employee2.name);
        System.out.println(employee2.age);
        System.out.println(employee2.position);
        System.out.println(employee2.salary);

        System.out.println(employee3.name);
        System.out.println(employee3.age);
        System.out.println(employee3.position);
        System.out.println(employee3.salary);

        System.out.println(employee4.name);
        System.out.println(employee4.age);
        System.out.println(employee4.position);
        System.out.println(employee4.salary);
    }
}
