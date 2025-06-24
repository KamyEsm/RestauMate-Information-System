package FileManager;

import java.io.File;
import java.io.FileWriter;

public class TxTFileManager implements ITxTFileManager{
    private String fileName;
    private File file;
    private String[] Rows;
    private int RowsCount;
    FileWriter fw;
    public TxTFileManager(String fileName) {
        this.fileName = fileName;
        try {
            this.file = new File(fileName);
            this.fw = new FileWriter(this.file, false);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        this.Rows=new String[100000];
        this.RowsCount=0;
    }

    @Override
    public void CreatFile() {
        if(file.exists()) {
            try {
                fw = new FileWriter(file);
                fw.flush();
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void CloseFile() {
        try
        {
            fw.close();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void DeleteFile() {
        file.delete();
    }


    @Override
    public void AppendRow(String... Rows) {
        String[] A=Rows;
        try {
            FileWriter fileWriter =new FileWriter(file);
            for (int i = 0; i < A.length; i++){
                fileWriter.append(A[i]+"\n");
                fileWriter.flush();
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void DeleteRow(String Row) {

    }

    @Override
    public void DeleteRow(int Row) {

    }

    @Override
    public void SearchRow(String Row) {

    }

    @Override
    public void SearchRow(int Row, String Row1) {

    }

    @Override
    public void UpdateRow(String Row, String Row1) {

    }

    @Override
    public void UpdateRow(int Row, String Row1) {

    }

    @Override
    public void InsertRow(int S, String Row1) {

    }
    //--------------------------------------------------------------->>>Other

    private void ArrayToFile(){
        for (int i = 0; i < RowsCount; i++){

        }
    }
    private void FileToArray(){}
}
