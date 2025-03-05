package edu.miu.cs.cs425.model;



import java.util.Arrays;
import java.util.List;

public class Publisher {
    private String name;
    private String address;
    private String phone;

    public Publisher(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Publisher: " + name + ", Address: " + address + ", Phone: " + phone;
    }
}


