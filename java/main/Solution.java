package main;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.User;

@SuppressWarnings({ "unused" })
public class Solution {

    private static PrintStream out = System.out;

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            list.add(new User("user" + i, i + 10));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}