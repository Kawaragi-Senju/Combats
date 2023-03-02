import screens.Screen;
import util.ContentManager;

public class Main {


    public static void main(String[] args) {
        ContentManager m = ContentManager.getInstance();
        Screen screen = m.getQueue().poll();
        while (screen != null){
            screen.execute();
            screen = m.getQueue().poll();
        }

    }
}
