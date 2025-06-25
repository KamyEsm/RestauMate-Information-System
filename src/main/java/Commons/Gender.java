package Commons;

public enum Gender {
    MALE("مرد")
    ,FEMALE("زن")
    ,OTHER("سایر");
    private String gender;
    Gender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
