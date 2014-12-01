package com.aug.daos;

import com.aug.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {
    public List<Employee> findUserByEmailPassword(Employee employee) {
        return new ArrayList<>();
    }
}
