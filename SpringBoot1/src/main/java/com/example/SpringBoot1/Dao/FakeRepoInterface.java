package com.example.SpringBoot1.Dao;

public interface FakeRepoInterface {
                
//    public Long id = id;
//        int insertUser(long Id, String name, String surname);

          void InsertUser(long Id, String name, String surname);
          void FindUserById(long Id);
          void DeleteUser(long Id);

}
