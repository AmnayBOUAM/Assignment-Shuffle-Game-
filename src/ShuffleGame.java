import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleGame {

    int[] array = { 1, 0, 1 };
    Scanner sc = new Scanner(System.in);
    void welcom(){
        System.out.println("----------------------------------welcome to shuffle game-------------------------------");
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? y/n");
    }
    void readyToPlay(){
        System.out.print(">");
        String response = sc.nextLine();
        if (response.equals("y")){
            shuffleTheGame();
            System.out.println("pick 1, 2 or 3!\n\t [*, *, *]");
            pick();
        } else if (response.equals("n")) {
            System.out.println("see you next time!");
        }else {
            System.out.println("are you ready to play? y/n");
            readyToPlay();
        }
        tryAgain();
    }
    int[] shuffleTheGame(){
        Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
                int randomIndexToSwap = rand.nextInt(array.length);
                int shuffle = array[randomIndexToSwap];
                array[randomIndexToSwap] = array[i];
                array[i] = shuffle;
            }
            return (array);
    }

    void pick(){
        System.out.print(">");
        String choice = sc.nextLine();
        if(choice.equals("1")){
            if (array[0]==0) {
                System.out.println("good guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
        } else if (choice.equals("2")) {
            if (array[1]==0){
                System.out.println("good guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
        } else if (choice.equals("3")) {
            if (array[2]==0){
                System.out.println("good guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(array));
        }else {
            System.out.println("pick 1, 2 or 3!\n\t [*, *, *]");
            pick();
        }
    }
    void tryAgain(){
        System.out.println("do you want to try again? y/n");
        System.out.print(">");
        String response = sc.nextLine();
        if (response.equals("y")){
            shuffleTheGame();
            System.out.println("pick 1, 2 or 3!\n\t [*, *, *]");
            pick();
            tryAgain();
        } else if (response.equals("n")) {
            System.out.println("see you next time!");
        }else {
            tryAgain();
        }
    }
}