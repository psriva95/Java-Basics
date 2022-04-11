package OOPSAbstraction;

public abstract class Page {

	public Page()
	{
		System.out.println("Page Const.......");
	}
	
	
//	public Page(int a)
//	{
//		System.out.println("page consts..." + a);
//	}
	
	
	public abstract void title();
	public abstract void url();
	
	public void timeout()
	{
		System.out.println("Time out is 10 secs");
	}
	
	public final void logo()
	{
		System.out.println("Logo");
	}
	
}
