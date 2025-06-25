package FileManager;

import Interface.IManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TxTFileManager implements IManager {
    private String fileName;
    private File file;
    private String[] Rows;
    private int RowsCount;
    FileWriter fw;
    public TxTFileManager(String fileName) {
        this.fileName = fileName;
        this.Rows=new String[100000];
        this.RowsCount=0;
    }

    public void CreatFile() {
        if(file == null || !file.exists()) {
            try {
                this.file = new File(fileName);
                file.createNewFile();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public void OpenWriter(boolean append) {
            try {
                if(fw != null) {
                    fw.close();
                    fw = null;
                }
                fw = new FileWriter(this.file, append);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    public void CloseWriter() {
        try
        {
            fw.close();
            fw = null;
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void DeleteFile() {
        file.delete();
    }


    public void ClearFile(){
        CloseWriter();
        try {
            if (file.delete()) {
                file.createNewFile();
                OpenWriter(false);
                CloseWriter();
            }
        } catch (IOException e) {
            System.err.println("Error clearing file: " + e.getMessage());
        }
    }


    @Override
    public void Append(String... Rows) {
        OpenWriter(true);
        try {
            for (String row : Rows) {
                fw.append(row).append("\n");
            }
            fw.flush();
        } catch (IOException e) {
            System.err.println("Error appending rows: " + e.getMessage());
        }
        CloseWriter();
    }

    @Override
    public void Delete(String Row) {
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
    public void Delete(int Row) {
        FileToArray();
        for (int i = Row; i <= RowsCount; i++){
            Rows[i]=Rows[i+1];
        }
        RowsCount--;
        ArrayToFile();
    }
    @Override
    public String NSearch(String N){
        FileToArray();
        for (int i = 0; i < RowsCount; i++){
            if(Rows[i].indexOf(N)!=-1){
                return Rows[i];
            }
        }
        return null;
    }

    @Override
    public String Search(String Row) {
        FileToArray();
        for (int i = 0; i < RowsCount; i++){
            if(Row.equals(Rows[i])){
                return Rows[i];
            }
        }
        return null;
    }

    @Override
    public String Search(int Row, String Row1) {
        FileToArray();
        for (int i = Row; i < RowsCount; i++){
            if(Row1.equals(Rows[i])){
                return Rows[i];
            }
        }
        return null;
    }

    @Override
    public void Update(String Row, String Row1) {
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
    public void Update(int Row, String Row1) {
        FileToArray();
        Rows[Row]=Row1;
        ArrayToFile();
    }

    @Override
    public void Insert(int S, String Row1) {
        FileToArray();
        for (int i = RowsCount-1; i >= S; i--){
            Rows[i+1]=Rows[i];
        }
        RowsCount++;
        ArrayToFile();
    }
    //--------------------------------------------------------------->>>Other

    private void ArrayToFile(){
        OpenWriter(false);
        try {
            for (int i = 0; i < RowsCount; i++) {
                if (Rows[i] != null) {
                    fw.write(Rows[i] + "\n");
                }
            }
            fw.flush();
        } catch (IOException e) {
            System.err.println("Error writing array to file: " + e.getMessage());
        }
        CloseWriter();
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


    public String[] GetRows(){
        return Rows;
    }
    public int GetRowsCount(){
        return RowsCount;
    }
    public File GetFile(){
        return this.file;
    }

}