package test;

class A{
	void messageA(){
		System.out.println("message from A");
	}
}

class PackageTest{
	public static void main(String[] args){
		A a = new A();
		a.messageA();
	}

}


