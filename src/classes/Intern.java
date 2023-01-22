package classes;

import classes.Employee;

public class Intern extends Employee {


    private final int MAX_SALARY = 20000;


    public Intern(int id, String name, int salary) {

        super(id, name, salary);
        if( salary > MAX_SALARY ) setSalary(MAX_SALARY);


    }



}
