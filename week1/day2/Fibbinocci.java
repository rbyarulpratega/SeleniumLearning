package week1.day2;

public class Fibbinocci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibbinocci fb= new Fibbinocci();
		fb.fibbinoccy();
    
	}
	
	private void fibbinoccy()
	{
		int firstNum = 0;
	    int secNum = 1;
	    int sum;
	    System.out.println("firstNum:"+firstNum);
	    for (int i = 0; i <11; i++) {
	    	sum=firstNum+secNum;
	    	System.out.println("Sum :"+sum);
	    	firstNum=secNum;
	    	secNum=sum;
		}
	}

}
