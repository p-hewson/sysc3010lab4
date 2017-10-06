
public class Hello {

	public static main(String[] args) 
	{
		Hello hello = new Hello();
		hello.methodA(150);
		hello.methodB();
		hello.methodC();
	}

	//counts down postitve numbers
	public void methodA(int n) {
		if(n == 0){
			System.out.println("Done");
			return;
		}
		System.out.println(n);
		methodA(n--);
	}

	public void methodB(void) {
		return;
		}

	public void methodC(int n) {
		if(n == 0)
			return;
		methodA(n);
		methodC(n--);
	}
}