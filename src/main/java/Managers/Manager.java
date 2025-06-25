package Managers;

import FileManager.TxTFileManager;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IManager{
    private TxTFileManager fileManager;

    public Manager(String fileName) {
        fileManager = new TxTFileManager(fileName);
        fileManager.CreatFile();
    }

    @Override
    public void Add(String... Rows) {
        fileManager.AppendRow(Rows);
    }

    @Override
    public void Delete(String Row) {
        fileManager.DeleteRow(Row);
    }

    @Override
    public void Delete(int Row) {
        fileManager.DeleteRow(Row);
    }

    @Override
    public String Search(String Row) {
        return fileManager.SearchRow(Row);
    }

    @Override
    public String Search(int Row, String Row1) {
        return fileManager.SearchRow(Row, Row1);
    }

    @Override
    public void Update(String Row, String Row1) {
        fileManager.UpdateRow(Row, Row1);
    }

    @Override
    public void Update(int Row, String Row1) {
        fileManager.UpdateRow(Row, Row1);
    }

    @Override
    public void Insert(int S, String Row1) {
        fileManager.InsertRow(S, Row1);
    }
}
