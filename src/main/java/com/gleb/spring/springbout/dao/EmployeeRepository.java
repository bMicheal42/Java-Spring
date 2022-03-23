package com.gleb.spring.springbout.dao;

import com.gleb.spring.springbout.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //можно оставить пустым можно добавить свои методы
    public List<Employee> findAllByName(String name); //название сами пишем
    // и если оно стандартное то можно не реализовывать
}
