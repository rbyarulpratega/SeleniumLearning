package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime primecheck=new IsPrime();
		primecheck.checkPrimeNumber(8);
		primecheck.checkPrimeNumber(13);
		primecheck.checkPrimeNumber(17);


	}
	public void checkPrimeNumber(int inp) {
		int flag= 0;
		for(int i=2;i<inp;i++) {
			if(inp%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Given input "+inp+" is a prime number");
		}
		else
		{
			System.out.println("Given input "+inp+" is not a prime number");

		}
	}
}
