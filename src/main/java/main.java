import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String word;

        Scanner input = new Scanner(System.in);
        System.out.println("Input word: ");
        word = input.next();

        score score = new score();
        int result = score.calculateScore(word);
        System.out.println(result);
    }
}
