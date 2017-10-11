
import java.util.ArrayList; 
import employee.Employee;
import java.util.*;
import java.lang.Character;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamlesh
 */
public class EmployeeController {
  public static void main(String arg[])
  {
      Integer numberOfEmployees;
      Integer id;
      String name;
      Float salary;
      String companyName;
      Boolean isShowEmployeeDetails =true;
      ArrayList<Employee> employeesList = new ArrayList<Employee>();
      Character findMore;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the no of employees:");
      numberOfEmployees = sc.nextInt();
      // get data
      for(int i =0; i<numberOfEmployees; i++)
      {
         
          System.out.println("Enter Id: ");
          id = sc.nextInt();
          System.out.println("Enter name: ");
          name = sc.next();
          System.out.println("Enter salary: ");
          salary = sc.nextFloat();
          System.out.println("Enter company name: ");
          companyName = sc.next();
          
          Employee employee = new Employee(id,name,salary,companyName);
          employeesList.add(employee);
      }
      
   // show data program
      while(isShowEmployeeDetails){
      Boolean found = false;    
      System.out.println("#### GET EMPLOYEE DETAILS ###");
      System.out.println("Enter employee id ");
      Integer employeeId = sc.nextInt();
      for(Employee emp: employeesList){
          if(emp.getId()==employeeId){
          System.out.println("name: "+emp.getName());
          System.out.println("salary: "+emp.getSalary());
          System.out.println("company name: "+emp.getCompanyName());
          found = true;
          break;
          }
      }
      if(!found){
          System.out.println("Employee not found!!!!!!");
      }
      System.out.println("Do you want to search more employee(Y/N)");
      findMore = sc.next().charAt(0);
      if(!new Character(Character.toLowerCase(findMore)).equals('y')){
      isShowEmployeeDetails = false;
      } 
     }
  }
    
}
