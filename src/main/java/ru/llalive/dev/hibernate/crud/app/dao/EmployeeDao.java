/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.llalive.dev.hibernate.crud.app.dao;

import java.util.List;
import ru.llalive.dev.hibernate.crud.app.model.Employee;

/**
 *
 * @author babikov_pv
 */
public interface EmployeeDao {

    Employee create();

    Employee read(int id);

    void update(Employee phone);

    void delete(Employee phone);

    List<Employee> getAll();
}
