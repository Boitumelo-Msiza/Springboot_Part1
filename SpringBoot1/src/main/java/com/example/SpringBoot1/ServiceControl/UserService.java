package com.example.SpringBoot1.ServiceControl;

import com.example.SpringBoot1.Dao.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {


       void addUser(String name, String surname);
       void removeUser(Long id);
       void getUserId(Long id);
}
