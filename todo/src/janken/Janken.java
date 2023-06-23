package janken;

import java.util.Random;
import java.util.Scanner;

public class Janken {
    
    public static void main (String[] args){

        String[] hands = {"グー","チョキ","パー","グーチョキパー"};
        int userNum = -1;

        System.out.println("じゃんけんで勝負しましょう。グー・チョキ・パーのいずれかを入力してください。");

        Scanner scanner = new Scanner(System.in);
        
        while(userNum < 0){

            System.out.print("あなた:");
            String hand = scanner.nextLine();

            for(int i = 0;i < hands.length;i++){
                if(hand.equals(hands[i])){
                    userNum=i;
                }
            };

            if(userNum < 0){
                System.out.println("無効な手です。もう一度入力してください。");
            }
        }

        Random random = new Random();
        int cpuNum = random.nextInt(3);

        System.out.println("相手："+hands[cpuNum]);

        String result;

        if(userNum == 3 || (userNum-cpuNum) == -1 || (userNum-cpuNum) == 2){
            result = "勝ち";
        } else if((userNum-cpuNum) == 0){
            result = "あいこ";
        } else {
            result = "負け";
        }

        System.out.println("結果は"+result+"です");

    }
}
