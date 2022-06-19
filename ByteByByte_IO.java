import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("file1.txt");
		//BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("file2.txt");
		//BufferedOutputStream bos = new BufferedOutputStream(fos);
		int i=0;
		while((i=fis.read())!=-1)
		{
		    fos.write(i);
		}
		System.out.println();
		fis.close();
		//bis.close();
		fos.close();
		//bos.close();
	}
}
