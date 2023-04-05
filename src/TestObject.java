class Test 
{
	public void add()
	{
		int a,b,c;
		a=20;
		b=10;
		c=a+b;
		System.out.println(c);
	}
}
class Test2
{
	public void subtract()
	{
		int a,b,c;
		a=20;
		b=10;
		c=a-b;
		System.out.println(c);
	}
}
public class TestObject {

	public static void main(String[] args) {
		//classname objectname=new classname();
		Test xyz=new Test();  //allocate memory
		xyz.add();
		Test2 abc=new Test2();  //allocate memory
		abc.subtract();
		System.out.println("Hi from main");

	}

}

