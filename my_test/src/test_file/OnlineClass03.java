package test_file;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class OnlineClass03 {
	public static void main(String[] args)  throws IOException{
	
        // FileWriterクラスを使用する
        FileWriter file = new FileWriter("/Users/Shared/java/java.txt");
        // PrintWriterクラスを使用する
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));
    	 
        //ファイルに書き込む
        pw.println("apple");
        pw.println("orange");
        pw.println("melon");
    	 
        //ファイルを閉じる
        pw.close();
    }

		
	}
