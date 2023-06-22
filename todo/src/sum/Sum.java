package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        
        double sum = 0;
        double num = 0;
        String str = "";

        System.out.println("合計を求めます");

        do {

            System.out.println("数値を入力してください。合計を表示するには「end」と入力してください。");

            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            //System.out.println(str);

            try {
                num = Double.parseDouble(str);
            } catch(NumberFormatException e){
                continue;
            }

            sum += num;

        }while(!str.equals("end"));

        System.out.println("合計："+sum);
    }

}

