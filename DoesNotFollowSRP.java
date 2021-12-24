import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private static int employeeCount = 1000;
    private String name;
    private int age;
    private int employeeNumber;
    private List<String> skills;
    private double basePay;
    private double houseRentAllowance;
    private double otherAllowance;
    private double salary;

    public Employee(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;
        this.employeeNumber = generateEmployeeNumber();
        this.skills = skills;
    }

    private int generateEmployeeNumber() {
        return employeeCount++;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getBasePay() {
        return this.basePay;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public double getHouseRentAllowance() {
        return this.houseRentAllowance;
    }

    public void setOtherAllowance(double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public double getOtherAllowance() {
        return this.otherAllowance;
    }

    public double calculatePay() {
        this.salary = this.basePay + this.houseRentAllowance + this.otherAllowance;
        return this.salary;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void displayEmployeeInfo() {
        System.out.println("\n Name - " + this.name);
        System.out.println("\n Age - " + this.age);
        System.out.println("\n Employee Number - " + this.employeeNumber);
        System.out.println("\n Skills - " + this.skills);
        System.out.println("\n Base Pay - " + this.getBasePay());
        System.out.println("\n House Rent Allowance HRA - " + this.getHouseRentAllowance());
        System.out.println("\n Other Allowance - " + this.getOtherAllowance());
        System.out.println("\n Total Pay - " + this.calculatePay());
    }
}

public class DoesNotFollowSRP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n Enter Name - \t");
        String name = s.next();

        System.out.print("\n Enter Age - \t");
        int age = s.nextInt();

        List<String> skills = new ArrayList<>();
        System.out.print("\n Enter Skills - \t");
        for (int i = 1; i <= 3; i++) {
            String skill = s.next();
            skills.add(skill);
        }

        Employee employee = new Employee(name, age, skills);

        System.out.print("\n Enter Base Pay - \t");
        double basePay = s.nextDouble();
        employee.setBasePay(basePay);

        System.out.print("\n Enter House Rent Allowance - \t");
        double houseRentAllowance = s.nextDouble();
        employee.setHouseRentAllowance(houseRentAllowance);

        System.out.print("\n Enter Other Allowance - \t");
        double otherAllowance = s.nextDouble();
        employee.setOtherAllowance(otherAllowance);

        System.out.print("\n Add New Skill - \t");
        String skill = s.next();
        employee.addSkill(skill);

        employee.displayEmployeeInfo();

        s.close();
    }
}
