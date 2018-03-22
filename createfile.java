import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;


public class createfile {
	public String getNucleotide() 
	{
		
		Random rd =new Random();
		switch(rd.nextInt(4))
		{
		case 0:  return "A";
		case 1:  return "C";
		case 2:  return "G";
		case 3:  return "T";
		default: return "";
		
		}
	}
	
	public String sequence(int length)
	{
		Random rd =new Random();
		if(length ==1)
			return getNucleotide();
		else
			return getNucleotide() + sequence(length - 1);
	}

	public String getchromosome() {
		
		Random rd =new Random();
		return "chr" + (rd.nextInt(23)+1);
	}
	
	public void createFile() 
	{
		try
		{
			FileWriter file = new FileWriter("sequences.txt");
			BufferedWriter bw = new BufferedWriter(file);
			
			String sequences ;
			Random rd =new Random();	
			int star,length; 
			int reads=1000;
			for(int i =0; i < reads; i++)
			{	
				length = rd.nextInt(50)+1;
				star =rd.nextInt(1000)+1;	
				System.out.println(sequence(length)+ ", " + getchromosome()
				+ ", " + star + ", " + (star+length-1)) ;
			}
			bw.flush();
			
		}
		catch(Exception ex) {
			
		}
	}
	public static void main(String[]args) 
	{
		createfile cd = new createfile();
		cd.createFile();
	
	}

}



