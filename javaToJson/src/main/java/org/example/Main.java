package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        try {
            Employee e1=new Employee(1,12000,"Radhika Saini","IT","radhika.saini@accolitedigitall.com");
            Employee e2=new Employee(2,15000,"Anuj Malik","IT","anuj.malik@accolitedigitall.com");
            Employee e3=new Employee(3,15000,"Santanu Dubey","HR","santanu.dubey@accolitedigitall.com");
            Employee e4=new Employee(4,17000,"Rajesh Aggarwal","Sales","rajesh.aggarwal@accolitedigitall.com");

            String json1 = new ObjectMapper().writeValueAsString(e1);
            String json2 = new ObjectMapper().writeValueAsString(e2);
            String json3 = new ObjectMapper().writeValueAsString(e3);
            String json4 = new ObjectMapper().writeValueAsString(e4);

            // print JSON string
            System.out.println(json1 + '\n' +json2 + '\n' + json3 + '\n' + json4);

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
class Employee{
    public int empid;
    public String name;
    public int salary;
    public String dept;
    public String email;
    public Employee(int Empid,int Salary,String Name,String Dept,String Email){
        this.dept=Dept;
        this.email=Email;
        this.empid=Empid;
        this.salary=Salary;
        this.name=Name;
    }
}
