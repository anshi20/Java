import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("file1.txt");
		//BufferedInputStream bis = new BufferedInputStream(fis);
		FileWriter fw = new FileWriter("file2.txt");
		//BufferedOutputStream bos = new BufferedOutputStream(fos);
		int i=0;
		while((i=fr.read())!=-1)
		{
		    fw.write(i);
		}
		System.out.println();
		fr.close();
		//bis.close();
		fw.close();
		//bos.close();
	}
}
