package com.example.SpringBoot1.Dao;

import com.example.SpringBoot1.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo implements FakeRepoInterface {

    private static List<User> DB = new ArrayList<>();

    @Override
    public void InsertUser(long Id, String name, String surname) {
        DB.add(new User(Id, name, surname));

    }

    @Override
    public void FindUserById(long Id) {
        DB.get((int) Id);
    }

    @Override
    public void DeleteUser(long Id) {
        DB.remove(Id);
    }
}
