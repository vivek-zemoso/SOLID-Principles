import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println("**************************");
        System.out.println(" Name - " + name);
        System.out.println(" Age - " + age);
    }
}

class Employee extends Person {

    private static int employeeCount = 1000;
    private int employeeNumber;
    private List<Skill> skills;
    private Salary salary;

    public Employee(String name, int age) {
        super(name, age);
        this.employeeNumber = generateEmployeeNumber();
    }

    private static int generateEmployeeNumber() {
        return employeeCount++;
    }

    // Composiiton
    public void assignSkills(List<Skill> skills) {
        this.skills = skills;
    }

    // Aggregation
    public void assignBasePay(double basePay, double houseRentAllowance, double otherAllowance) {
        this.salary = new Salary(basePay, houseRentAllowance, otherAllowance);
    }

    public void displayEmployeeInfo() {
        showPerson();
        System.out.println(" Employee Number - " + this.employeeNumber);
        System.out.println(" Skills :- ");
        for (Skill skill : this.skills) {
            skill.displaySkill();
        }
        System.out.println(" Salary - " + this.salary.calculatePay());
        System.out.println("**************************");
    }
}

class Skill {
    private String name;
    private int proficiency;

    public Skill(String name, int proficiency) {
        this.name = name;
        this.proficiency = proficiency;
    }

    public void displaySkill() {
        System.out.println("\t" + name + " " + proficiency);
    }
}

class Salary {
    private double basePay;
    private double houseRentAllowance;
    private double otherAllowance;
    private double salary;

    public Salary(double basePay, double houseRentAllowance, double otherAllowance) {
        this.basePay = basePay;
        this.houseRentAllowance = houseRentAllowance;
        this.otherAllowance = otherAllowance;
    }

    public double calculatePay() {
        this.salary = this.basePay + this.houseRentAllowance + this.otherAllowance;
        return this.salary;
    }
}

public class FollowsSRP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n Enter Name - \t");
        String name = s.next();

        System.out.print("\n Enter Age - \t");
        int age = s.nextInt();

        Person person = new Person(name, age);
        person.showPerson();

        List<Skill> skills = new ArrayList<>();
        System.out.println("\n Enter Skills -");
        for (int i = 1; i <= 3; i++) {
            System.out.print("\n Enter Skill Name - \t");
            String skillName = s.next();
            System.out.print("\n Enter Skill Proficiency -  \t");
            int proficiency = s.nextInt();
            Skill skill = new Skill(skillName, proficiency);
            skills.add(skill);
        }

        Employee employee = new Employee(name, age);
        employee.assignSkills(skills);

        System.out.print("\n Enter Base Pay Amount - \t");
        double basePay = s.nextDouble();
        System.out.print("\n Enter House Rent Allowance Amount - \t");
        double houseRentAllowance = s.nextDouble();
        System.out.print("\n Enter Other Allowance Amount - \t");
        double otherAllowance = s.nextDouble();
        employee.assignBasePay(basePay, houseRentAllowance, otherAllowance);

        System.out.println("\n Add New Skill - ");

        System.out.print("\n Skill Name - \t");
        String skillName = s.next();

        System.out.print("\n Skill Proficiency - \t");
        int proficiency = s.nextInt();

        skills.add(new Skill(skillName, proficiency));

        employee.displayEmployeeInfo();

        s.close();
    }

}
