package main;

import classes.Employee;
import classes.Intern;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
      /*  Intern intern1 = new Intern(1, "Yisus", 1500000);
        System.out.println(intern1.getClass());
        System.out.println(intern1); */




        Employee employee1 = new Employee(2,"Nico", 15000);
        Employee employee2 = new Employee(3,"Jofre", 100001);
        Employee employee3 = new Employee(4,"Mark", 100000);
        Employee employee4 = new Employee(5,"Sanchez", 15);
        Intern employee5 = new Intern(6,"Clara", 18000);
        Intern employee6 = new Intern(7,"Pepe", 1500);
        Intern employee7 = new Intern(8,"Pablito", 180000);
        Employee employee8 = new Employee(9,"Mercedes", 190000);
        Employee employee9 = new Employee(10,"Gatuso", 200000);
        Intern employee10 = new Intern(11,"Wilfredo", 50000);





        FileWriter writer = new FileWriter("employees.txt", false);


            writer.write(
                "Id: " + employee1.getId() + " Name: " + employee1.getName() + " Salary: " + employee1.getSalary() + "\n" +
                    "Id: " + employee2.getId() + " Name: " + employee2.getName() + " Salary: " + employee2.getSalary() + "\n" +
                    "Id: " + employee3.getId() + " Name: " + employee3.getName() + " Salary: " + employee3.getSalary() + "\n" +
                    "Id: " + employee4.getId() + " Name: " + employee4.getName() + " Salary: " + employee4.getSalary() + "\n" +
                    "Id: " + employee5.getId() + " Name: " + employee5.getName() + " Salary: " + employee5.getSalary() + "\n" +
                    "Id: " + employee7.getId() + " Name: " + employee7.getName() + " Salary: " + employee7.getSalary() + "\n" +
                    "Id: " + employee6.getId() + " Name: " + employee6.getName() + " Salary: " + employee6.getSalary() + "\n" +
                    "Id: " + employee8.getId() + " Name: " + employee8.getName() + " Salary: " + employee8.getSalary() + "\n" +
                    "Id: " + employee9.getId() + " Name: " + employee9.getName() + " Salary: " + employee9.getSalary() + "\n" +
                    "Id: " + employee10.getId() + " Name: " + employee10.getName() + " Salary: " + employee10.getSalary() );






        writer.close();
    }

}




