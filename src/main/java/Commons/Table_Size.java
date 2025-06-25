package Commons;

public enum Table_Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");
    private String Size;
    Table_Size(String Size) {
        this.Size = Size;
    }
    public String getSize(){
        return Size;
    }

    @Override
    public String toString() {
        return Size;
    }
}
