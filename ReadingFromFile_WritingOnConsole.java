import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("file1.txt");
		BufferedReader br = new BufferedReader(fr);

		String i;
		while((i=br.readLine())!=null)
		{
		   System.out.println(i);
		}
		System.out.println();

		br.close();
		fr.close();
	}
}
