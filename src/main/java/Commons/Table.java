package Commons;

public class Table {
    private Table_Size Size;
    private int TableNumber;

    public Table(int TableNumber, Table_Size Size) {
        this.SetTableNumber(TableNumber);
        this.SetSize(Size);
    }

    public Table_Size GetSize() {
        return this.Size;
    }
    public int GetTableNumber() {
        return this.TableNumber;
    }
    public void SetSize(Table_Size Size) {
        this.Size = Size;
    }
    public void SetTableNumber(int TableNumber) {
            this.TableNumber = TableNumber;
    }
}
