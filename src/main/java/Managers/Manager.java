package Managers;

import FileManager.TxTFileManager;
import Interface.IManager;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IManager {
    private TxTFileManager fileManager;

    public Manager(String fileName) {
        fileManager = new TxTFileManager(fileName);
        fileManager.CreatFile();
    }

    @Override
    public void Append(String... Rows) {
        fileManager.Append(Rows);
    }

    @Override
    public void Delete(String Row) {
        fileManager.Delete(Row);
    }

    @Override
    public void Delete(int Row) {
        fileManager.Delete(Row);
    }

    @Override
    public String Search(String Row) {
        return fileManager.Search(Row);
    }

    @Override
    public String Search(int Row, String Row1) {
        return fileManager.Search(Row, Row1);
    }

    @Override
    public void Update(String Row, String Row1) {
        fileManager.Update(Row, Row1);
    }

    @Override
    public void Update(int Row, String Row1) {
        fileManager.Update(Row, Row1);
    }

    @Override
    public void Insert(int S, String Row1) {
        fileManager.Insert(S, Row1);
    }
}
