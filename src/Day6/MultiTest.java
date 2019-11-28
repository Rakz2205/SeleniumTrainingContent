package Day6;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class MultiTest 
{
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("------Before Method-------");
	}
	
	@Test(priority=3)
	public void Test1()
	{
		System.out.println("-------------Test 1------------");
	}
	
	@Test(priority=2)
	public void Test2()
	{
		System.out.println("-------------Test 2------------");
	}
	
	@Test(priority=1)
	public void Test3()
	{
		System.out.println("-------------Test 3------------");
	}
	
	@Test(priority=0)
	public void Test4()
	{
		System.out.println("-------------Test 4------------");
	}
}
