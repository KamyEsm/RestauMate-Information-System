package FileManager;

public class Main {
    public static void main(String[] args) {
        TxTFileManager T=new TxTFileManager("Hello");
        T.AppendRow("Hello");
        T.UpdateRow("Hello","World");
    }
}
