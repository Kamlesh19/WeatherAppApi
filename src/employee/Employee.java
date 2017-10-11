package employee;
import java.util.ArrayList;

public class Employee {
    private Integer id;
    private String name;
    private Float salary;
    private String companyName;
    
    public void setId(Integer id){
    this.id = id;
    }
    public Integer getId(){
    return id;
    }
    
    public void setName(String name)
    {
        this.name=name;
        
    }
    public String getName()
    {
        return name;
    }
    
    public void setSalary(Float salary)
    {
        this.salary=salary;
    }
    public Float getSalary()
    {
        return salary;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName=companyName;
    }
    public String getCompanyName(){
    return companyName;
    }
    
    
public Employee(){

}
public Employee(Integer id, String name, Float salary, String companyName)
{
this.id= id;
this.name= name;
this.salary= salary;
this.companyName= companyName;
}

}
