class ExceptionTest4{
	public static void main(String[] args){
		try{
			System.out.println("in the try statement");
			int [] a = new int[2];
			a[0] = 5;
			a[2] = 4;
			int i = 10, j = 0;
			int k = i/j;
			System.out.println("K = " + k);
		}catch(ArithmeticException e){
			System.out.println("in the catch statement");
			System.out.println("Divided by zero");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("in the catch statement");
			System.out.println("Array index has been exceeded");
			System.out.println(e);
		}finally{
			System.out.println("in the finally statement");
		}
	}
}

			
