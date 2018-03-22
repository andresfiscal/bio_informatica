
public interface menu {
	
	public static void main(String[] args)
	{
		createfile cf = new createfile();
		cf.createFile();
		
		SearchMotif sm = new  SearchMotif();
		sm.getcombinations("", 3);
		
		System.out.println(sm.ocurrences+ " - "  + sm.motif);
	}
}
