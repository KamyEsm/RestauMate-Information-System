package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

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
    public void ClearFile(){
        try {
            file.delete();
            File file1 = new File(fileName);
            file = file1;
            fw = new FileWriter(file);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    @Override
    public void AppendRow(String... Rows) {
        String[] A=Rows;
        try {
            for (int i = 0; i < A.length; i++){
                fw.append(A[i]+"\n");
                fw.flush();
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
     }

    @Override
    public void DeleteRow(String Row) {
        FileToArray();
        for (int i = 0; i < RowsCount; i++){
            if(Row.equals(Rows[i])){
                for (int j = i; j <= RowsCount; j++){
                    Rows[j]=Rows[j+1];
                }
                RowsCount--;
                break;
            }
        }
        ArrayToFile();
    }

    @Override
    public void DeleteRow(int Row) {
        FileToArray();
        for (int i = Row; i <= RowsCount; i++){
            Rows[i]=Rows[i+1];
        }
        RowsCount--;
        ArrayToFile();
    }

    @Override
    public String SearchRow(String Row) {
        FileToArray();
        for (int i = 0; i < RowsCount; i++){
            if(Row.equals(Rows[i])){
                return Rows[i];
            }
        }
        return null;
    }

    @Override
    public String SearchRow(int Row, String Row1) {
        FileToArray();
        for (int i = Row; i < RowsCount; i++){
            if(Row1.equals(Rows[i])){
                return Rows[i];
            }
        }
        return null;
    }

    @Override
    public void UpdateRow(String Row, String Row1) {
        FileToArray();
        int C=0;
        for (int i = 0; i < RowsCount; i++){
            if(Row.equals(Rows[i])){
                C=i;
            }
        }
        Rows[C]=Row1;
        ArrayToFile();
    }

    @Override
    public void UpdateRow(int Row, String Row1) {
        FileToArray();
        Rows[Row]=Row1;
        ArrayToFile();
    }

    @Override
    public void InsertRow(int S, String Row1) {
        FileToArray();
        for (int i = RowsCount-1; i >= S; i--){
            Rows[i+1]=Rows[i];
        }
        RowsCount++;
        ArrayToFile();
    }
    //--------------------------------------------------------------->>>Other

    private void ArrayToFile(){
        try {
            ClearFile();
            for (int i = 0; i < RowsCount; i++){
                fw.append(Rows[i]+"\n");
            }
            fw.flush();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
    private void FileToArray(){
        for (int i = 0; i < RowsCount; i++){
            Rows[i]=null;
        }
        try {
            Scanner sc = new Scanner(file);
            RowsCount=0;
            while (sc.hasNextLine()){
                Rows[RowsCount++]=sc.nextLine();
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    private String[] GetRows(){
        return Rows;
    }
    private int GetRowsCount(){
        return RowsCount;
    }

}
