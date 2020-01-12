import java.io.*;

public void Kiir(String fajlnev){
		try{
			PrintWriter f1 = new PrintWriter(fajlnev+".txt");
			f1.print(eredmeny);
			f1.close();
			}
			
		catch (Exception e){         
			System.out.println(e);
		}
	}
