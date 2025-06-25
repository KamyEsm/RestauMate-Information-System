package Commons;

import Splitter.Splitter;

public class Admin extends Member {
    private boolean Owner;
    private String Password;
    public Admin() {}
    public Admin(int ID, String Name, String LastName, int Age, String NationalCode, Gender gender
    , boolean Owner, String Password) {
        super(ID, Name, LastName, Age, NationalCode, gender);
        SetOwner(Owner);
        SetPassword(Password);
    }

    public boolean isOwner() {
        return Owner;
    }
    public void SetOwner(boolean Owner) {
        this.Owner = Owner;
    }
    public String GetPassword() {
        return Password;
    }
    public boolean SetPassword(String Password) {
        if(Password.indexOf(" ")!=-1)
            return false;
        this.Password = Password;
        return true;
    }
    @Override
    public String toString() {
        return super.toString() + Splitter.SEPARATOR + Owner + Splitter.SEPARATOR + Password;
    }

}
