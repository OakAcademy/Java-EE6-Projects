package iterator;

public class main {

	public static void main(String[] args) {
		
		NameCollection collection=new NameCollection();
		for(Iterator iterator=collection.getIterator(); iterator.hasNext();)
		{
			
			String Authorname=(String) iterator.next();
			System.out.println("Author name is: "+Authorname);
		}

	}

}
