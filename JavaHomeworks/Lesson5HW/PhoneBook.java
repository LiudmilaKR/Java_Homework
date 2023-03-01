package Homeworks.JavaHomeworks.Lesson5HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    
    private Map<String, ArrayList<String>> pb = new HashMap<>();
    
    void addData (String name, String phone) {
        if (pb.containsKey(name)) pb.get(name).add(phone);
        else {
            ArrayList<String> ph = new ArrayList<>();
            ph.add(phone);
            pb.put(name, ph);
        }
    }
    
    void printPhones(String name) {
        for (Map.Entry<String, ArrayList<String>> ent : pb.entrySet()) {
            if (ent.getKey().equals(name)) System.out.println(ent);
        }
    }

    void printName(String phone) {
        for (Map.Entry<String, ArrayList<String>> ent : pb.entrySet()) {
            for (String el : ent.getValue()) {
                if (el.equals(phone)) System.out.println(ent.getKey());
            }
        }
    }

    void printPb() {
        for (Map.Entry<String, ArrayList<String>> ent : pb.entrySet()) {
            System.out.println(ent);
        }
    }
}
