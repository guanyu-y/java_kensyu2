class ExceptionTest5{
	public static void main(String[] args){
		try{
			int i = 10, j = 0;
			System.out.println("Before calling method");
			int k = calc(i,j);
			System.out.println("After calling method");
			System.out.println("K = " + k);
		}catch(ArithmeticException e){
			System.out.println("Exception of method caller");
			System.out.println("Error:Divided by zero");
			System.out.println(e);	
		}
	}
	static int calc(int i, int j)throws ArithmeticException{
		System.out.println("in the method");
		int ans = i/j;
		return ans;
	}
}


