class NumberFormatCheck{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.print("Input an integer");
			System.exit(1);
		}
		try{
			int a = Integer.parseInt(args[0]);
			System.out.println("Inputed integer is" + a);
		}catch(NumberFormatException e){
			System.out.println("Input an integer");
		}
	}
}
			


