class Arguments{
	public static void main(String[] args){
		System.out.println("コマンドライン引数の数は:" + args.length + "個です");
		System.out.println("コマンドライン引数は以下の通りです");
		for(String s : args){
			System.out.println(s);
		}
	}
}
