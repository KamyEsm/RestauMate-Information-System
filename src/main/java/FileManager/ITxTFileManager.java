package FileManager;

public interface ITxTFileManager {
    public void CreatFile();
    public void DeleteFile();
    public void CloseFile();
    public void AppendRow(String... Rows);
    public void DeleteRow(String Row);
    public void DeleteRow(int Row);
    public void SearchRow(String Row);
    public void SearchRow(int Row, String Row1);
    public void UpdateRow(String Row,String Row1);
    public void UpdateRow(int Row,String Row1);
    public void InsertRow(int S,String Row1);
}
