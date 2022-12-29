package week1.day2;

public class Calculator {

	public int addThreeNumbers(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	public int multiplyTwoNumbers(int num4,int num5) {
		return num4*num5;
	}
	public void divTwoNumbers() {
		int num6=20;
		int num7=5;
		System.out.println("Division Result is : "+num6/num7);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		int addresult=cal.addThreeNumbers(10, 20, 30);
		System.out.println("Addition Result is : "+addresult);
		int multiplyresult=cal.multiplyTwoNumbers(10, 20);
		System.out.println("Multiplication Result is : "+multiplyresult);
		cal.divTwoNumbers();
		
	}

}
