package util;

import screens.ExitScreen;
import screens.MainMenuScreen;
import screens.Screen;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class ContentManager {

    private static ContentManager instance;
    public static final String MAIN_MENU_SCREEN = "mm";
    public static final String CREATE_CHARACTER_SCREEN = "cc";
    public static final String EXIT_SCREEN = "e";

    private HashMap<String, Screen> screens= new HashMap<>();
    private LinkedList<Screen> queue = new LinkedList<>();


    private ContentManager() {
        screens.put(MAIN_MENU_SCREEN, new MainMenuScreen());
        //screens.put(CREATE_CHARACTER_SCREEN, new Cre)
        screens.put(EXIT_SCREEN, new ExitScreen());

    }

    public HashMap<String, Screen> getScreen() {
        return screens;
    }



    public LinkedList<Screen> getQueue() {
        return queue;
    }

    public void addScreenToQueue(String key) {
        if (key == null) {
            return;
        }
       Screen sc =  screens.get(key);
       if (sc != null) {
           queue.add(sc);
       }
    }

    public static ContentManager getInstance() {
       if (instance == null) {
         instance = new ContentManager();
       }
       return instance;
    }
}
