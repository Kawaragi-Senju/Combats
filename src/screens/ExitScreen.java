package screens;

public class ExitScreen implements Screen{

    @Override
    public void execute() {
        System.out.println("Game will be finished!");
        System.exit(0);
    }
}
