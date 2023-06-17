package Abstraction;

//Abstraction

public abstract class TestBank 
{
	abstract int getRateOfInterest();
		
}

class SBI extends TestBank     
{
		int getRateOfInterest()
		{
			return 7;
		}
		
}

class PNB extends TestBank
{
		int getRateOfInterest()
		{
			return 8;
		}
			
}

class Abstraction
{
		public static void main(String[] args) 
		{
			System.out.println("------------------SBI Bank----------------");
				SBI s1=new SBI();	
					s1.getRateOfInterest();
					{
						System.out.println("Rate of interest is: "+s1.getRateOfInterest() + "%");
					}
					
			System.out.println();
			System.out.println("---------------------PNB Bank---------------");
				PNB p1=new PNB();
	            	p1.getRateOfInterest();
	            	{
	            		System.out.println("Rate of interst is: "+p1.getRateOfInterest() + "%");
	            	}
		}	
		
}

