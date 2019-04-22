import java.util.Scanner;

class kakunin3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("科目の点数を入力してください。");
        System.out.print("英語：");
        int english = scan.nextInt();
        System.out.print("数学：");
        int math = scan.nextInt();
        System.out.print("理科: ");
        int science = scan.nextInt();
        int sum = english + math + science;
        System.out.println("合計："+(english+math+science));
        System.out.println("平均："+(english+math+science)/3.0);
    }
}
