package FileManager;

public interface ITxTFileManager {
    public void CreatFile();
    public void DeleteFile();
    public void CloseFile();
    public void ClearFile();
    public void AppendRow(String... Rows);
    public void DeleteRow(String Row);
    public void DeleteRow(int Row);
    public String SearchRow(String Row);
    public String SearchRow(int Row, String Row1);
    public void UpdateRow(String Row,String Row1);
    public void UpdateRow(int Row,String Row1);
    public void InsertRow(int S,String Row1);
}
