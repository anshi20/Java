import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        FileOutputStream fos = new FileOutputStream("File.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos); 
		System.out.println("Enter a string : ");
		String s = br.readLine();
		byte b[] = s.getBytes();
		System.out.println();
        bos.write(b);
        bos.close();
        fos.close();
		br.close();
		isr.close();
	}
}
