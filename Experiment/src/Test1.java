class Calc{
	int num1;
	int num2;
	String text;
	
	public Calc(int num1,int num2,String text)
	{
		this.num1=num1;
		this.num2=num2;
		this.text=text;
	}
}











class Test1{
	
	public static void main(String[] args) {
	
	Calc obj=new Calc(4,5,"hello");
	
	System.out.print(obj.num1+" "+obj.num2+" "+obj.text);
	
	
	
	
	
	
	
	
	
	}
}