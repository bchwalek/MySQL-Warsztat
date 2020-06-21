package pl.coderslab.entity;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;


public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User user = new User();
        user.setEmail("bb@gmail.com");
        user.setUserName("Bart Bartkowski");
        user.setPassword("haslo");

//        userDao.create(user);

        System.out.println(UserDao.read(10));

        User updateUser = UserDao.read(10);
        updateUser.setUserName("Tomasz");
//        UserDao.update(updateUser);


        UserDao.delete(10);

////        System.out.println(ArrayUtils.toString(UserDao.findAll()));

        User[] all = UserDao.findAll();

        for (User u : all) {
            System.out.println(u);
        }
    }
}