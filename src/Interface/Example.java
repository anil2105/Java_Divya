package Interface;

//Interface

public interface Example 
{
	public void login();
	
	void username();
	
	void password();
	
}

class Test implements Example
{
	public void login()
	{
		System.out.println("Login");
	}
	
	public void username()
	{
		System.out.println("Username");
	}
	
	public void password()
	{
		System.out.println("Password");
	}
}

class Interface
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
			t1.login();
			t1.username();
			t1.password();
	}
}
