package com.java.streamelements;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollect {
    public static void main(String[] args) {

        List<user> userList = new ArrayList<>();
        userList.add(new user(1,"ansu","ansu","ansu@gmail.com"));
        userList.add(new user(2,"ramu","a","ramu@gmail.com"));
        userList.add(new user(3,"ram","4545","ram@gmail.com"));
        userList.add(new user(4,"sita","ans545u","sita@gmail.com"));

        //Traditional way to map objects using for loop
        List<userDTO> userDTOList = new ArrayList<>();
        for (user str: userList)
        {
            userDTOList.add(new userDTO(str.getId(),str.getUserName(),str.getEmail()));
        }
        for (userDTO stri: userDTOList)
        {
            System.out.println(stri);
        }

//        userList.stream().map(new Function<user, userDTO>() {
//            @Override
//            public userDTO apply(user user) {
//                return new userDTO(user.getId(),user.getUserName(),user.getEmail());
//            }
//        });


        userList.stream().map((user user)-> new userDTO(user.getId(),user.getUserName(),user.getEmail()) )
                .forEach(userDTO -> {System.out.println(userDTO);});

    }
}
class userDTO {
    private int id;
    private String userName;

    private String email;

    public userDTO(int id, String userName, String email) {
        super();
        this.id = id;
        this.userName = userName;

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                  '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class user {
    private int id;
    private String userName;
    private String password;
    private String email;

    public user(int id, String userName, String password, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}