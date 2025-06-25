package Managers;

import Commons.Admin;
import Commons.Gender;

public class Test {
    public static void main(String[] args) {
        Manager AdminManager = new Manager("AdminList");
        Admin admin = new Admin((int) (Math.random()*10000),"Kamy","Esmaeilpour",20,
                "0250561409", Gender.MALE,true,"k13851385");
        AdminManager.Append(admin.toString());
    }
}
