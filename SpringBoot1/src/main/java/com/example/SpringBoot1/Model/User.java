package com.example.SpringBoot1.Model;

public class User {

    private long Id;
    private String name;
    private String surname;

    public User(long Id, String name, String surname){
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }

        public long getId(){
              return Id ;
    }
        public void setId(long Id){
        this.Id = Id;
        }

        public  String getName(){
        return name;
    }
        public void setName(String name){
        this.name = name;
        }

        public String getSurname(){
        return surname;
        }
        public void setSurname(String surname){
        this.surname = surname;
        }

}
