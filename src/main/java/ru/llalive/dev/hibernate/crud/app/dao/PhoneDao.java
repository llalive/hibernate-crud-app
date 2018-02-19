/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.llalive.dev.hibernate.crud.app.dao;

import java.util.List;
import ru.llalive.dev.hibernate.crud.app.model.Phone;

/**
 *
 * @author babikov_pv
 */
public interface PhoneDao {

    Phone create();

    Phone read(int id);

    void update(Phone phone);

    void delete(Phone phone);

    List<Phone> getAll();
}
