package com.example.SpringBoot1.ServiceControl;

import com.example.SpringBoot1.Dao.FakeRepo;
import com.example.SpringBoot1.Dao.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired

    FakeRepo fakerepo;


    @Override
    public void addUser(String name, String surname) {
        fakerepo.InsertUser(123,name,surname);
        System.out.println("name entered : " + name);
    }

    @Override
    public void removeUser(Long id) {
        fakerepo.DeleteUser(123);
        System.out.println("name removed");
    }

    @Override
    public void getUserId(Long id) {
        fakerepo.FindUserById(123);
        System.out.println("Hello: " );
    }
}
