package Commons;

public enum CategoryFood {
    FASTFOOD("FastFood")
    ,KEBAB("Kebab")
    ,DESSERT("Dessert")
    ,DRINKS("Drinks");
    private String FoodType;
    CategoryFood(String gender) {
        this.FoodType = gender;
    }
    public String getGender() {
        return FoodType;
    }

    @Override
    public String toString() {
        return FoodType;
    }
}

