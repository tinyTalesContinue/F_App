import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("難易度を選択してください: easy[E] / normal[N]");
        System.out.println("E または N を入力してください");
        //入力を受け取る
        char difficulty = scanner.next().charAt(0);
        if(difficulty == 'E'){
            System.out.println("かんたんモード");
        }else if(difficulty == 'N'){
            System.out.println("ふつうモード");
        }else{
            System.out.println("無効な入力です");
        }
        scanner.close();
    }
}
