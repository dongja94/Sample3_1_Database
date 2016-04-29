package com.begentgroup.sampledatabase;

/**
 * Created by dongja94 on 2016-04-29.
 */
public class Person {
    long id = -1;
    String name;
    String phone;
    String address;
    String office;

    @Override
    public String toString() {
        return name + "\n" + phone + "\n" + address + "\n" + office;
    }
}
