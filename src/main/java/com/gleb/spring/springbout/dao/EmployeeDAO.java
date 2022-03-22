package com.gleb.spring.springbout.dao;
import com.gleb.spring.springbout.entity.Employee;

import javax.persistence.Entity;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
