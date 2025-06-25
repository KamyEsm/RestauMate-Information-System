package Commons;

import Splitter.Splitter;

import java.util.Random;

public class Member {
    private int ID;
    private String Name;
    private String LastName;
    private int Age;
    private String NationalCode;
    private Gender gender;
    public Member() {}
    public Member(int ID, String Name, String LastName, int Age, String NationalCode, Gender gender) {
        this.SetAge(Age);
        this.SetNationalCode(NationalCode);
        this.SetGender(gender);
        this.SetName(Name);
        this.SetLastName(LastName);
        this.SetID(ID);
    }
    public boolean SetID(int ID) {
        if(ID >= 0 && ID<10000) {
            this.ID = ID;
            return true;
        }
        return false;
    }
    public boolean SetName(String name) {
        if(name.isEmpty())
            return false;
        if(name.length()<3 || name.length()>15)
            return false;
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='0' && chars[i]<='9') {
                return false;
            }
        }
        this.Name = name;
        return true;
    }
    public boolean SetLastName(String LastName) {
        if(LastName.isEmpty())
            return false;
        if(LastName.length()<3 || LastName.length()>15)
            return false;
        char[] chars = LastName.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='0' && chars[i]<='9') {
                return false;
            }
        }
        this.LastName = LastName;
        return true;
    }

    public boolean SetAge(int Age) {
        if(Age >= 18 && Age <= 100){
            this.Age = Age;
            return true;
        }
        return false;
    }

    public boolean SetNationalCode(String NationalCode) {
        if(NationalCode.isEmpty())
            return false;
        if(NationalCode.length()!=10){
            return false;
        }
        char[] chars = NationalCode.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i]>='0' && chars[i]<='9')) {
                return false;
            }
        }
        this.NationalCode = NationalCode;
        return true;
    }

    public void SetGender(Gender gender) {
        this.gender = gender;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAge() {
        return Age;
    }
    public String getNationalCode() {
        return NationalCode;
    }
    public Gender getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return ID + Splitter.SEPARATOR + Name + Splitter.SEPARATOR + LastName + Splitter.SEPARATOR + Age
                + Splitter.SEPARATOR + NationalCode + Splitter.SEPARATOR + gender;
    }

}
