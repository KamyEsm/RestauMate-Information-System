package Interface;

public interface IManager {
    public void Append(String... Rows);
    public void Delete(String Row);
    public void Delete(int Row);
    public String Search(String Row);
    public String Search(int Row, String Row1);
    public void Update(String Row,String Row1);
    public void Update(int Row,String Row1);
    public void Insert(int S,String Row1);
    public String NSearch(String N);
}
