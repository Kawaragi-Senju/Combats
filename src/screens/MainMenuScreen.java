package screens;

import util.ContentManager;
import java.util.Scanner;

public class MainMenuScreen implements Screen{

    private final String HEADER = "Welcome to the Combats! \n Please, choose your next step \n by entering of one of the numbers. ";


    @Override
    public void execute() {
        System.out.println(HEADER);
        System.out.println("1. Create character");
        System.out.println("2. Exit");
        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean needToReadKey = true;
        while (needToReadKey)
            str = sc.nextLine();
            switch (str) {
                case "1":
                    ContentManager.getInstance().addScreenToQueue(ContentManager.CREATE_CHARACTER_SCREEN);
                    needToReadKey = false;
                    break;
                case "2":
                    ContentManager.getInstance().addScreenToQueue(ContentManager.EXIT_SCREEN);
                    needToReadKey = false;
                    break;
                default:
                    System.out.println("Unknown command, please repeat");
            }
        }

}
