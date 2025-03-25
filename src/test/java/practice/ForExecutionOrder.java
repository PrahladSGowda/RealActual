package practice;

import org.testng.annotations.Test;

public class ForExecutionOrder {
@Test
public void testMethod1()
{
	System.out.println("test1");
}
@Test(priority=2)
public void testMethod2()
{
	System.out.println("test2");
}
@Test(priority=4)
public void testMethod3()
{
	System.out.println("test3");
}
@Test
public void testMethod4()
{
	System.out.println("test4");
}
}

