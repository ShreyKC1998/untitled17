package Ch6_Classes;

import org.junit.Test;

import java.util.Scanner;

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department,String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;

    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";

    }
    public Employee(){
        this.name = "";
        this.department = "";
        this.position = "";
        this.idNumber = 0;

    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return getName() + "\t\t" + getIdNumber() + "\t\t\t" + getDepartment() + "\t\t\t" + getPosition();
    }

    public static void main(String[] args) {


        Employee test = new Employee();
        Employee test1 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee test2 = new Employee("Joy Rogers", 81774);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        System.out.println("Enter ID number: ");
        int idNum = input.nextInt();
        System.out.println("Enter Department name: ");
        String dept = input.nextLine();
        String dept1 = input.nextLine();
        System.out.println("Enter position: ");
        String pos = input.nextLine();

        test.setName(name);
        test.setIdNumber(idNum);
        test.setDepartment(dept1);
        test.setPosition(pos);
        System.out.println("Name\t\t\tID Number\t\tDepartment\t\tPosition");
        System.out.println(test.getName() +
                "\t\t" + test.getIdNumber() +
                "\t\t" + test.getDepartment() +
                "\t\t" + test.getPosition());

        System.out.println(test1);
        //test2.setDepartment("Manufacturing");
        //test2.setPosition("Engineer");
        System.out.println(test2 + "\t\t" + test2.getDepartment() + "\t\t" + test2.getPosition());
    }

}